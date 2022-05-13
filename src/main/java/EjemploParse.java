import org.json.JSONArray;
import org.json.JSONObject;


public class EjemploParse {
    static String json = "" +
            "{" +
            "    \"pageInfo\": {" +
            "            \"pageName\": \"Homepage\"," +
            "            \"logo\": \"https://www.example.com/logo.jpg\"" +
            "    }," +
            "    \"posts\": [" +
            "            {" +
            "                \"post_id\": \"0123456789\"," +
            "                \"actor_id\": \"1001\",\n" +
            "                \"author_name\": \"Jane Doe\"," +
            "                \"post_title\": \"How to parse JSON in Java\"," +
            "                \"comments\": []," +
            "                \"time_of_post\": \"1234567890\"" +
            "            }," +

         "            {" +
         "                \"post_id\": \"1234567890\"," +
         "                \"actor_id\": \"1001\",\n" +
         "                \"author_name\": \"Jane Doe\"," +
         "                \"post_title\": \"How to parse JSON in Java\"," +
         "                \"comments\": [\"Hola\"]," +
         "                \"time_of_post\": \"1234567890\"" +
         "            }" +
            "    ]" +

            "}";
    public static void main(String[] args) {
 /* String cadenaJSON = "{ " +
        "   \"data\": {" +
        "   \"id\": 2," +
        "   \"email\": \"janet.weaver@reqres.in\"," +
        "   \"first_name\": [\"Janet\",\"Brown\"]," +
        "   \"vivo\": \"false\"," +
        "   \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"" +
        "   }," +
        "   \"support\": {" +
        "   \"url\": \"https://reqres.in/#support-heading\"," +
        "   \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"" +
        "   }" +
        "}";

        JSONObject mm= new JSONObject(cadenaJSON);

        String correo= mm.getJSONObject("data").getString("email");

        Boolean vivo= mm.getJSONObject("data").getBoolean("vivo");
        System.out.println(correo);

        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);



        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);*/

            JSONObject obj = new JSONObject(json);
            String pageName = obj.getJSONObject("pageInfo").getString("pageName");

            System.out.println(pageName);



            JSONArray arr = obj.getJSONArray("posts");
            for (int i = 0; i < arr.length(); i++) {
                String post_id = arr.getJSONObject(i).getString("post_id");
                JSONArray comments = arr.getJSONObject(i).getJSONArray("comments");
                System.out.println(post_id);
        }
    }
}

