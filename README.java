OmClickListener

package com.boo.onclickevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // деклариране на обекти от клас Button, които програмно ще свържа с View,
    // съответстващи на реалните бутони
    private Button btn1, btn2;

    // деклариране на обект от клас TextView, който програмно ще свържа с View,
    // съответстващо на текстови етикет
    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
      /*
       setContentView зарежда съдържанието на Activity от (layout) ресурсен файл
       activity_main.xml, с описание на графичния интерфейс (GUI);
       Като аргумент се указва не пътя към файла (res/layout/activity_main.xml),
       а константа, която се генерира авоматично във файла R.java. */

        setContentView(R.layout.activity_main);

        // За удобство ще създадем и ще извикаме помощна функция за инициализиране
        init();
    }

    private void init() {
        // Свързване на помощните обекти, декларираnи в заглавната част на класа,
        // с View от Activity, които съответстват на реалните елементи:
        // Посредством (Button) се променя типът View, който връща findViewById
        btn1 = (Button) findViewById(R.id.buton1);
        btn2 = (Button) findViewById(R.id.buton2);
        txt1 = (TextView) findViewById(R.id.text1);
        /*
        // Следва регистриране на слушател на събития (event listener) при бутоните
        // с използване на интерфейса  OnEventListener.
        // За да се използва трябва да се добави с import в заглавната част на текущия клас.
        View.OnClickListener listener1 = new View.OnClickListener() {
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
            @Override
            public void onClick(View view) {
                // Следва да се установи стойност на етикета.
                // За целта се използва метод setText, който установява нова стойност.
                txt1.setText("Здравей, Свят!");
            }
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
        };

        // Самата регистрация на слушателя се извършва посредством метод setOnEventListener,
        // на който като параметър се подава наследения клас listener от клас OnEventListener

        btn1.setOnClickListener(listener1);

        // Аналогично се регистрира слушател и за втория бутон.
        View.OnClickListener listener2 = new View.OnClickListener() {
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
            @Override
            public void onClick(View view) {
                // Следва да се установи стойност на етикета.
                // За целта се използва метод setText, който установява нова стойност.
                txt1.setText("Hello World!");
            }
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
        };

        // Самата регистрация на слушателя се извършва посредством метод setOnEventListener,
        // на който като параметър се подава наследения клас listener от клас OnEventListener
        btn2.setOnClickListener(listener2);
         */


        // Следва регистриране на слушател на събития (event listener) при бутоните
        // с използване на интерфейса  OnEventListener.
        // За да се използва трябва да се добави с import в заглавната част на текущия клас.
        View.OnClickListener listener3 = new View.OnClickListener() {
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
            @Override
            public void onClick(View view) {
                // Следва да се установи стойност на етикета.
                // За целта се използва метод setText, който установява нова стойност.
                if (view.getId()==R.id.buton1) txt1.setText("Hello World!"); else txt1.setText("Здравей, Свят!");
            }
            // В наследения клас се декларира метод OnClick(), за обработка на събитие
        };

        // Самата регистрация на слушателя се извършва посредством метод setOnEventListener,
        // на който като параметър се подава наследения клас listener от клас OnEventListener

        btn1.setOnClickListener(listener3);
        btn2.setOnClickListener(listener3);

    }

}

