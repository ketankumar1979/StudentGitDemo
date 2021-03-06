package GitPractice.PageObjectPackage;

public class GetListOfUsers {

    public String baseUri(){
        String URL = "https://reqres.in/";
        return URL;
    }

    public String resource(){
        String resource = "/api/users?page=2";
        return resource;
    }
}
