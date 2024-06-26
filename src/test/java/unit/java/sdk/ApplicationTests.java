package unit.java.sdk;

import org.junit.Test;
import unit.java.sdk.api.*;
import unit.java.sdk.model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static unit.java.sdk.TestHelpers.CreateApplicationRequest;
import static unit.java.sdk.TestHelpers.getApiClient;

public class ApplicationTests {
    @Test
    public void GetApplicationListApiTest() throws ApiException {
        GetListApplicationsApi api = new GetListApplicationsApi(getApiClient());

        ListPageParametersObject page = new  ListPageParametersObject();
        page.setLimit(20);
        page.setOffset(3);

        UnitListApplicationsResponse response = api.execute(page, null ,null);
        assert response.getData().size() <= 20;
    }

    @Test
    public void GetApplicationListWithFilterApiTest() throws ApiException {
        GetListApplicationsApi api = new GetListApplicationsApi(getApiClient());
        ExecuteFilterParameter filter = new ExecuteFilterParameter();
        ListPageParametersObject page = new  ListPageParametersObject();

        ArrayList statuses = new ArrayList();
        statuses.add(ExecuteFilterParameter.StatusEnum.APPROVED);
        filter.setQuery("John");
        filter.setStatus(statuses);

        UnitListApplicationsResponse response = api.execute(page, filter ,null);
        assert response.getData().size() != 0;

        response.getData().forEach(x -> {
            if(!x.getType().equals("individualApplication"))
                return;

            IndividualApplication individualApp = (IndividualApplication)x;
            String status = individualApp.getAttributes().getStatus().getValue();
            assert status.equals("Approved");
        });
    }
   @Test
    public void GetApplicationApiTest() throws ApiException {
        GetListApplicationsApi api = new GetListApplicationsApi(getApiClient());

        UnitListApplicationsResponse response = api.execute(null, null, null);
        assert response.getData().size() != 0;

        GetApplicationApi getApi = new GetApplicationApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                UnitApplicationResponseWithIncluded app = getApi.execute(x.getId(), null);
                assert app.getData().getId().equals(x.getId());
                assert app.getData().getType().toLowerCase()
                        .equals(app.getData().getClass().getSimpleName().toLowerCase());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    public void UpdateApplicationApiTest() throws ApiException {
        GetListApplicationsApi api = new GetListApplicationsApi(getApiClient());
        ExecuteFilterParameter filters = new ExecuteFilterParameter();
        // filters.status(new ArrayList<StatusEnum>(){new ExecuteFilterParameter.StatusEnum[]{ExecuteFilterParameter.StatusEnum.APPROVED}})
        UnitListApplicationsResponse response = api.execute(null, null, null);
        assert response.getData().size() != 0;

        UpdateApplicationApi updateApi = new UpdateApplicationApi(getApiClient());

        response.getData().forEach(x -> {
            try {
                if(!x.getType().equals("individualApplication"))
                    return;

                IndividualApplication individualApp = (IndividualApplication)x;
                String status = individualApp.getAttributes().getStatus().getValue();
                if(!(status.equals("Approved") || status.equals("PendingReview") || status.equals("AwaitingDocuments")))
                    return;

                PatchIndividualApplication body = new PatchIndividualApplication();
                PatchIndividualApplicationAttributes attributes = new PatchIndividualApplicationAttributes();
                attributes.setOccupation(Occupation.ARCHITECTORENGINEER);
                body.setAttributes(attributes);

                UpdateApplicationData d = new UpdateApplicationData(body);
                UpdateApplication ua = new UpdateApplication();
                ua.data(d);

                UnitApplicationResponseWithIncluded app = updateApi.execute(x.getId(), ua);
                assert app.getData().getId().equals(x.getId());
                assert app.getData().getType().toLowerCase()
                        .equals(app.getData().getClass().getSimpleName().toLowerCase());
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }


    @Test
    public void CreateApplicationApiTest() throws ApiException {
        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());
        UnitCreateApplicationResponse res = apiClient.execute(CreateApplicationRequest());
        assert res.getData().getType().equals("individualApplication");
    }
//    @Test
//    public void CreateDocumentForApplicationApiTest() throws ApiException {
//        CreateApplicationApi apiClient = new CreateApplicationApi(getApiClient());
//        UnitCreateApplicationResponse res = apiClient.execute(CreateApplicationRequest());
//        assert res.getData().getType().equals("individualApplication");
//
//        CreateADocumentForAnApplicationApi createApi = new CreateADocumentForAnApplicationApi(getApiClient());
//        UnitDocumentResponse document = createApi.execute(res.getData().getId());
//        assert document.getData().getType().equals("document");
//    }

    @Test
    public void GetApplicationDocumentsApiTest() throws ApiException {
        GetListApplicationsApi api = new GetListApplicationsApi(getApiClient());

        UnitListApplicationsResponse response = api.execute(null, null, null);
        assert response.getData().size() != 0;
    }

    @Test
    public void ListDocumentsApiTest() throws ApiException {
        GetListOfDocumentsApi api = new GetListOfDocumentsApi(getApiClient());
        GetListApplicationsApi listApplicationsApi = new GetListApplicationsApi(getApiClient());

        UnitListApplicationsResponse response = listApplicationsApi.execute(null, null, null);
        assert response.getData().size() != 0;

        response.getData().forEach(x -> {
            try {
                List<Document> documents = api.execute(x.getId()).getData();
                documents.forEach(doc -> {
                   assert doc.getType().equals("document");
                });
            } catch (ApiException e) {
                throw new RuntimeException(e);
            }
        });
    }

//    @Test
//    public void uploadPngFile() throws ApiException, IOException {
//        Path path = Paths.get(".\\unit_photo.png");
//        byte[] data = Files.readAllBytes(path);
//
//        UploadAPngDocumentForAnApplicationApi api = new UploadAPngDocumentForAnApplicationApi(getApiClient());
//        UnitDocumentResponse response = api.execute("applicationId", "documentId", data);
//
//        assert response.getData().getType().equals("document");
//    }
}