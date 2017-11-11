package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import cc.somkiat.basicunittesting.model.EmailValidation;
import cc.somkiat.basicunittesting.model.NameValidation;

public class MainActivity extends AppCompatActivity {

    private TextView userNameInput, emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
    }

    private void bindView() {
        this.userNameInput = findViewById(R.id.userNameInput);
        this.emailInput = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {

        String name = this.userNameInput.getText().toString();
        String email = this.emailInput.getText().toString();

        NameValidation nameValidation = new NameValidation();
        EmailValidation emailValidation = new EmailValidation();

        if (!nameValidation.validate(name)) {
            Toast.makeText(this, nameValidation.getExceptionClass().getMessage(),
                    Toast.LENGTH_SHORT).show();
        } else if (!emailValidation.validate(email)) {
            Toast.makeText(this, "Email is not valid.",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Success!!!",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        this.userNameInput.setText("");
        this.emailInput.setText("");
    }
}
