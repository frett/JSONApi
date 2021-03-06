package br.com.gustavofao.jsonapisample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.gustavofao.jsonapi.JSONApiConverter;

import br.com.gustavofao.jsonapisample.V2.City;
import br.com.gustavofao.jsonapisample.V2.User;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JSONApiConverter api = new JSONApiConverter(
                City.class,
                User.class
        );

//        if (new User().equals(new User()))
//            Toast.makeText(MainActivity.this, "Equal", Toast.LENGTH_SHORT).show();
//        else
//            Toast.makeText(MainActivity.this, "Not equals", Toast.LENGTH_SHORT).show();

        User u = new User();
        City city = new City();

        city.setId("123");
        u.setCity(city);

        Log.d("TAG", api.toJson(u));

//        InputStream is = getResources().openRawResource(R.raw.data);
//        Writer writer = new StringWriter();
//        char[] buffer = new char[1024];
//        try {
//            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//            int n;
//            while ((n = reader.read(buffer)) != -1) {
//                writer.write(buffer, 0, n);
//            }
//            is.close();
//        } catch (Exception ex) {}
//
//        String json = writer.toString();
//        JSONApiObject obj = api.fromJson(json);
//        if (obj.hasErrors()) {
//            List<ErrorModel> errorList = obj.getErrors();
//            for (ErrorModel model : errorList) {
//                StringBuilder builder = new StringBuilder();
//                if (model.getSource() != null) {
//                    if (model.getSource().getPointer() != null) {
//                        builder.append(String.format("Pointer: %s - ", model.getSource().getPointer()));
//                    }
//
//                    if (model.getSource().getParameter() != null) {
//                        builder.append(String.format("Parameter: %s - ", model.getSource().getParameter()));
//                    }
//                }
//
//                if (model.getDetail() != null) {
//                    builder.append(String.format("Details: %s - ", model.getDetail()));
//                }
//
//                if (model.getTitle() != null) {
//                    builder.append(String.format("Title: %s - ", model.getTitle()));
//                }
//
//                if (model.getStatus() != null) {
//                    builder.append(String.format("Status: %s - ", model.getStatus()));
//                }
//
//                Toast.makeText(MainActivity.this, builder.toString(), Toast.LENGTH_SHORT).show();
//            }
//        } else
//            Toast.makeText(MainActivity.this, "No Errors", Toast.LENGTH_SHORT).show();
    }

}
