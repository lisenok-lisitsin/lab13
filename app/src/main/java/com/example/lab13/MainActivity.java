package com.example.lab13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText af, bf;
    String url, catsi, catha;
    TextView result;
    boolean boolman;
    static Switch d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        af = findViewById(R.id.a_field);
        bf = findViewById(R.id.b_field);
        result = findViewById(R.id.result);
        d = findViewById(R.id.DegreesSwitch);
        url = "https://sav4.pythonanywhere.com";
        catsi = "/simath/";
        catha = "/hamath";
        boolman = false;
    }

    public void on_plusBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/+/"+num2);
    }

    public void on_minusBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/-/"+num2);
    }

    public void on_divBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/|/"+num2);
    }

    public void on_multBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/*/"+num2);
    }

    public void on_fullBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/||/"+num2);
    }

    public static String checkers(String man){
        boolean woman = d.isChecked();
        if (woman == true){
            man = "/degrees";
            return man;
        }
        else{
            man = "/rads";
            return man;
        }
    }

    public void on_modBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catsi+ num1+ "/mod/"+num2);
    }

    public void on_sqrtBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        String useless = "";
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catha+"/root/"+ num1+ "/" +num2 + checkers(useless));
    }

    public void on_sinBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        String useless = "";
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catha+"/sin/"+ num1+ "/" +num2 + checkers(useless));
    }

    public void on_cosBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        String useless = "";
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catha+"/cos/"+ num1+ "/" +num2 + checkers(useless));
    }

    public void on_tanBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        String useless = "";
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catha+"/tan/"+ num1+ "/" +num2 + checkers(useless));
    }

    public void on_powBut_click(View v){
        String num1 = af.getText().toString();
        String num2 = bf.getText().toString();
        String useless = "";
        HttpRequest r = new HttpRequest(this){
            @Override
            public void on_request_complete(String response){
                Log.e("RESULT", response);
                result.setText(response);
            }
        };
        r.make_request (url+catha+"/pow/"+ num1+ "/" +num2 + checkers(useless));
    }


}