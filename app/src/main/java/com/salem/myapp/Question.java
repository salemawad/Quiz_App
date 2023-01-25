package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.salem.myapp.adapter.QuestionAdapter;
import com.salem.myapp.modle.Item2;
import com.salem.myapp.modle.Qustion;

import java.util.ArrayList;
import java.util.Objects;

public class Question extends AppCompatActivity {
    ArrayList<Qustion> questions = new ArrayList<>();
    QuestionAdapter questionAdapter;
    TextView butn_next, idQ;
    Item2 item2;
    TextView text_get;

    RecyclerView rvQuestion;
    int current = 0;
    int Scour = 0;

    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        idQ = findViewById(R.id.idQ);
        rvQuestion = findViewById(R.id.rvQuestion);
        butn_next = findViewById(R.id.butn_next);
        text_get = findViewById(R.id.text_get);
        Intent intent = getIntent();
        item2 = intent.getParcelableExtra("qus");
        text_get.setText(item2.getName());

        switch (item2.getId()) {
            case (1):
                Question_1();
                break;
            case (2):
                Question_2();
                break;
            case (3):
                Question_3();
                break;
            case (4):
                Question_4();

                break;
            case (5):
                Question_5();
                break;
            case (6):
                Question_6();
                break;
            case (7):
                Question_7();
                break;
            case (8):
                Question_8();
                break;
            case (9):
                Question_9();
                break;
            case (10):
                Question_10();
                break;
            case (11):
                Question_11();
                break;
                case (12):
                Question_12();
                break;
                case (13):
                Question_13();
                break;
            case (14):
                Question_14();
                break;
            case (15):
                Question_15();
                break;
        }

        butn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((current - 1) < questions.size()) {
                    Scour++;
                    updateScore(Scour);
                    current++;
                    setData(current);

                }
            }
        });
    }





















    //تحديث رقم السؤال
    private void updateScore(int Scour) {
        idQ.setText("السؤال / " + Scour);

    }

    private void setData(int current) {
        questionAdapter = new QuestionAdapter(questions.get(current));
        rvQuestion.setLayoutManager(new LinearLayoutManager(Question.this));
        rvQuestion.setAdapter(questionAdapter);
    }
//الوحدة الاولى
    private void Question_1() {
        Qustion question1 = new Qustion();
        question1.setName("ما المفهوم الذي يطلق على حالة الجو لإقليم ما خلال فترة زمنية طويلة تزيد عن 35 سنة ؟");
        question1.setCorrect_answer("المناخ");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("الطقس");
        strings.add("الحرارة الكامنة");
        strings.add("العواصف");
        strings.add("المناخ");
        question1.setAnswer_list(strings);


        Qustion question2 = new Qustion();
        question2.setName("ما المفهوم الذي يطلق على حالة الجو لمنطقة محددة خلال فترة زمنية قصيرة يوم او عدة ايام ؟");
        question2.setCorrect_answer("الطقس");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("المناخ");
        strings2.add("الحرارة النوعية");
        strings2.add("الحرارة الكامنة");
        strings2.add("الطقس");
        question2.setAnswer_list(strings2);


        Qustion question3 = new Qustion();
        question3.setName(" ما العلم الذي يدرس الغلاف الجوي و عناصر المناخ و الطقس و مدى تأثيرها على مظاهر الحياة ؟ ");
        question3.setCorrect_answer("الجغرافيا المناخية");
        ArrayList<String> strings3 = new ArrayList<>();
        strings3.add("الجغرافيا المناخية");
        strings3.add(" الجغرافيا الفلكية");
        strings3.add("جغرافية المياه");
        strings3.add("الجغرافية الحيوية");
        question3.setAnswer_list(strings3);


        Qustion question4 = new Qustion();
        question4.setName(" كم تشكل الاشعة المرئية من مجموع الاشعاع الشمسي ؟");
        question4.setCorrect_answer("45%");
        ArrayList<String> strings4 = new ArrayList<>();
        strings4.add("15%");
        strings4.add("25%");
        strings4.add("35%");
        strings4.add("45%");
        question4.setAnswer_list(strings4);

        Qustion question5 = new Qustion();
        question5.setName("كم تشكل الاشعة غير المرئية ذات الموجات الطويلة  من مجموع الاشعاع الشمسي؟");
        question5.setCorrect_answer("46%");
        ArrayList<String> strings5 = new ArrayList<>();
        strings5.add("45%");
        strings5.add("46%");
        strings5.add("9%");
        strings5.add("55%");
        question5.setAnswer_list(strings5);

        Qustion question6 = new Qustion();
        question6.setName("كم تشكل الاشعة غير المرئية ذات الموجات القصيرة جدا  من مجموع الاشعاع الشمسي ؟ ");
        question6.setCorrect_answer("9%");
        ArrayList<String> strings6 = new ArrayList<>();
        strings6.add("55%");
        strings6.add("46%");
        strings6.add("45%");
        strings6.add("9%");
        question6.setAnswer_list(strings6);


        Qustion question7 = new Qustion();
        question7.setName(" كم يبلغ طول الاشعة ذات الموجات القصيرة ؟ ");
        question7.setCorrect_answer("4.  – 7. مايكرون ");
        ArrayList<String> strings7 = new ArrayList<>();
        strings7.add("4.  – 7. مايكرون ");
        strings7.add("7.   -  4مايكرون");
        strings7.add(" اقل من 4. مايكرون");
        strings7.add("اكثر من 4. مايكرون ");
        question7.setAnswer_list(strings7);


        Qustion question8 = new Qustion();
        question8.setName("اعطي امثلة على الاشعة غير المرئية ذات الموجات الطويلة ؟");
        question8.setCorrect_answer("الاشعة تحت الحمراء");
        ArrayList<String> strings8 = new ArrayList<>();
        strings8.add("اشعة جاما");
        strings8.add("الاشعة السينية ");
        strings8.add("الاشعة فوق البنفسجية");
        strings8.add("الاشعة تحت الحمراء");
        question8.setAnswer_list(strings8);


        Qustion question9 = new Qustion();
        question9.setName("ما الاشعة التي تمد الارض بالضوء و الحرارة ؟ ");
        question9.setCorrect_answer("تحت الحمراء ");
        ArrayList<String> strings9 = new ArrayList<>();
        strings9.add(" فوق البنفسجية ");
        strings9.add("تحت الحمراء ");
        strings9.add("جاما");
        strings9.add("السينية");
        question9.setAnswer_list(strings9);


        Qustion question10 = new Qustion();
        question10.setName("ضمن أي موجات تصنف الاشعة المرئية ( الوان الطيف ) ؟");
        question10.setCorrect_answer("القصيرة");
        ArrayList<String> strings10 = new ArrayList<>();
        strings10.add("الطويلة");
        strings10.add("المتوسطة");
        strings10.add("القصيرة");
        strings10.add("القصيرة جدا");
        question10.setAnswer_list(strings10);

        Qustion question11 = new Qustion();
        question11.setName("ما الاشعة التي تستجيب لها العين البشرية ؟");
        question11.setCorrect_answer("المرئية");
        ArrayList<String> strings11 = new ArrayList<>();
        strings11.add("الغير مرئية ذات الموجات الطويلة");
        strings11.add("الغير مرئية ذات الموجات القصيرة جدا");
        strings11.add("المرئية");
        strings11.add("الغير مرئية ذات الموجات المتوسطة");
        question11.setAnswer_list(strings11);

        Qustion question12 = new Qustion();
        question12.setName(" أي انواع  الاشعة الاتية لا تعتبر من الاشعة ذات الموجات القصيرة جدا ؟ ");
        question12.setCorrect_answer("الاشعة تحت الحمراء");
        ArrayList<String> strings12 = new ArrayList<>();
        strings12.add(" الاشعة السينية");
        strings12.add("اشعة جاما");
        strings12.add("الاشعة تحت الحمراء");
        strings12.add("الاشعة فوق البنفسجية");
        question12.setAnswer_list(strings12);


        Qustion question13 = new Qustion();
        question13.setName(" ما كمية اشعة الشمس التي تستقبلها السفوح الجبلية المواجهة لسقوط اشعة الشمس ؟");
        question13.setCorrect_answer("كبيرة");
        ArrayList<String> strings13 = new ArrayList<>();
        strings13.add("كبيرة");
        strings13.add(" صغيرة");
        strings13.add("متوسطة");
        strings13.add("قليلة");
        question13.setAnswer_list(strings13);


        Qustion question14 = new Qustion();
        question14.setName("ما اسباب ضعف كمية اشعة الشمس الواصلة الى مناطق غرب و وسط اوروبا ؟");
        question14.setCorrect_answer("45%");
        ArrayList<String> strings14 = new ArrayList<>();
        strings14.add("15%");
        strings14.add("25%");
        strings14.add("35%");
        strings14.add("45%");
        question14.setAnswer_list(strings14);
///
        Qustion question15 = new Qustion();
        question15.setName("أي المناطق التي تعتبر الغيوم و الدخان من مسببات اضعاف وصول اشعة الشمس اليها ؟ ");
        question15.setCorrect_answer("غرب و وسط اوروبا");
        ArrayList<String> strings15 = new ArrayList<>();
        strings15.add("وسط افريقيا");
        strings15.add("الوطن العربي");
        strings15.add("المناطق القطبية");
        strings15.add("غرب و وسط اوروبا");
        question15.setAnswer_list(strings15);

        Qustion question16 = new Qustion();
        question16.setName("ما الجهاز الذي يقيس درجة حرارة الهواء في الغلاف الجوي ؟ ");
        question16.setCorrect_answer("الثير وميتر");
        ArrayList<String> strings16 = new ArrayList<>();
        strings16.add("الباروميتر");
        strings16.add("الانيموميتر");
        strings16.add(" السيكروميتر");
        strings16.add("الثير وميتر");
        question16.setAnswer_list(strings16);


        Qustion question17 = new Qustion();
        question17.setName(" في أي فصول السنة يقل وصول كمية اشعة الشمس الى سطح الارض ؟ ");
        question17.setCorrect_answer(" الشتاء");
        ArrayList<String> strings17 = new ArrayList<>();
        strings17.add("الصيف");
        strings17.add("الخريف");
        strings17.add(" الشتاء");
        strings17.add("الربيع");
        question17.setAnswer_list(strings17);


        Qustion question18 = new Qustion();
        question18.setName(" كم تتراوح نسبة الالبيدو الارضي للثلج ؟");
        question18.setCorrect_answer(" 60 – 90%");
        ArrayList<String> strings18 = new ArrayList<>();
        strings18.add("20 – 40 %");
        strings18.add(" 35 – 50% ");
        strings18.add(" 10 – %15");
        strings18.add(" 60 – 90%");
        question18.setAnswer_list(strings18);


        Qustion question19 = new Qustion();
        question19.setName("على ماذا يطلق مفهوم قدرة الجو وسطح الارض و ما عليه من اجسام على رد الشمسية الى الفضاء ؟");
        question19.setCorrect_answer("الالبيدو الارضي");
        ArrayList<String> strings19 = new ArrayList<>();
        strings19.add(" المناخ");
        strings19.add("الطقس");
        strings19.add("الضغط الجوي");
        strings19.add("الالبيدو الارضي");
        question19.setAnswer_list(strings19);


        Qustion question20 = new Qustion();
        question20.setName("على ماذا يطلق مفهوم انتقال الحرارة من الارض و ما عليه من اجسام الى الهواء الملامس لها ؟");
        question20.setCorrect_answer("التوصيل الحراري");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("التوصيل الحراري");
        strings20.add("الحمل الحراري");
        strings20.add("فقدان الحرارة الكامنة");
        strings20.add(" الاشعاع الحراري الارضي");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("عند أي ارتفاع عن سطح الارض تنخفض الحرارة درجة مئوية واحدة ؟ ");
        question21.setCorrect_answer("150متر");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("150متر");
        strings21.add("15متر");
        strings21.add("510 متر");
        strings21.add("130متر ");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("كم تكون الحرارة عند ارتفاع 450 متر اذا كانت درجة الحرارة عند مستوى سطح البحر 17 درجة مئوية ؟ ");
        question22.setCorrect_answer("14 درجة مئوية");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add(" 16 درجة مئوية");
        strings22.add(" 15 درجة مئوية");
        strings22.add("14 درجة مئوية");
        strings22.add(" 13 درجة مئوية");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName(" ما المنطقة التي تمتد بين دائرتي عرض ( . – 5 ) شمال و جنوب خط الاستواء؟ ");
        question23.setCorrect_answer("الاستوائية");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("الاستوائية");
        strings23.add(" المدارية");
        strings23.add(" المعتدلة  ");
        strings23.add("القطبية ");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("كم يبلغ المعدل الحراري السنوي في المناطق الاستوائية ؟ ");
        question24.setCorrect_answer("22 درجة مئوية");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add(" صفر درجة مئوية");
        strings24.add("17 درجة مئوية");
        strings24.add("22 درجة مئوية");
        strings24.add(" 25 درجة مئوية");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName(" بين أي دائرتي عرض تمتد المنطقة المدارية شمال و جنوب خط الاستواء ؟ ");
        question25.setCorrect_answer("( 5 – 23.5 )");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("( . – 5 )");
        strings25.add("( 5 – 23.5 )");
        strings25.add("( 23.5 – 66.5 )");
        strings25.add("( 66.5 – 90 )");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("ما المنطقة التي يبلغ فيها معدل الحرارة السنوي 25 درجة مئوية ؟ ");
        question26.setCorrect_answer("المدارية");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("الاستوائية");
        strings26.add("المدارية");
        strings26.add("المعتدلة");
        strings26.add("القطبية");
        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("ما المنطقة التي تمتد بين دائرتي عرض ( 23.5 – 66.5 ) شمال و جنوب خط الاستواء ؟");
        question27.setCorrect_answer("المعتدلة");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("الاستوائية");
        strings27.add("المدارية");
        strings27.add("المعتدلة");
        strings27.add("القطبية");
        question27.setAnswer_list(strings27);

        Qustion question28 = new Qustion();
        question28.setName("كم يبلغ المعدل الحراري السنوي في المناطق المعتدلة ؟");
        question28.setCorrect_answer("17 درجة مئوية");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("صفر درجة مئوية");
        strings28.add("17 درجة مئوية");
        strings28.add("22 درجة مئوية");
        strings28.add("25 درجة مئوية");
        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName(" بين أي دائرتي عرض تمتد المنطقة القطبية شمال و جنوب خط الاستواء ؟");
        question29.setCorrect_answer("( 66.5 – 90 )");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("( . – 5 )");
        strings29.add("( 5 – 23.5 )");
        strings29.add("( 23.5 – 66.5 )");
        strings29.add("( 66.5 – 90 )");
        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("ماذا يقصد بكمية الحرارة اللازمة لرفع درجة حرارة 1 غم من المادة درجة مئوية واحدة ؟ ");
        question30.setCorrect_answer("الحرارة النوعية");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("نقطة الندى");
        strings30.add("الحرارة الكامنة");
        strings30.add("الحرارة النوعية");
        strings30.add("التلوث الحراري");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName(" ما التيار البحري الذي يؤثر على سواحل غرب اوروبا ؟");
        question31.setCorrect_answer("الخليج الدافئ");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("البرازيل الدافئ");
        strings31.add("موزمبيق الدافئ");
        strings31.add("اليابان الدافئ");
        strings31.add("الخليج الدافئ");
        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ما السواحل التي يرفع فيها تيار اليابان الدافئ درجات الحرارة ؟ ");
        question32.setCorrect_answer("الشرقية لأسيا");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("الشرقية لأمريكا الشمالية");
        strings32.add("الشرقية لأسيا");
        strings32.add("الغربية لأوروبا");
        strings32.add("الغربية لأفريقيا");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("ما التيار البحري البارد الذي يؤثر على سواحل غرب افريقيا ؟");
        question33.setCorrect_answer("كناري البارد");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("كمشتكا البارد");
        strings33.add("شرق استراليا الدافئ");
        strings33.add("بيرو البارد");
        strings33.add("كناري البارد");
        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("ما التيار البحري الذي يرفع حرارة سواحل شرق امريكا الشمالية ؟ ");
        question34.setCorrect_answer("الخليج الدافئ");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("البرازيل الدافئ");
        strings34.add("موزمبيق الدافئ");
        strings34.add("اليابان الدافئ");
        strings34.add("الخليج الدافئ");
        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName(" ما التيار البحري الذي يؤثر على سواحل غرب افريقيا ؟");
        question35.setCorrect_answer("بنجويلا البارد");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add(" كمشتكا البارد");
        strings35.add("شرق استراليا الدافئ");
        strings35.add("بيرو البارد");
        strings35.add("بنجويلا البارد");
        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("كم يعادل الضغط الجوي عند مستوى سطح البحر ؟");
        question36.setCorrect_answer("1013 مليبار");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("1013 مليبار");
        strings36.add("1015 مليبار");
        strings36.add("1010 مليبار");
        strings36.add("1020 مليبار");
        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("أي من الاجهزة التالية يقيس الضغط الجوي ؟");
        question37.setCorrect_answer("الباروميتر الزئبقي و المعدني");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("الثير وميتر");
        strings37.add("الانيموميتر");
        strings37.add("الباروميتر الزئبقي و المعدني");
        strings37.add("السيكروميتر");
        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("عند أي ارتفاع ينخفض الضغط الجوي مليبار واحد ؟");
        question38.setCorrect_answer("10 متر");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("15 متر");
        strings38.add("20 متر");
        strings38.add(" 30 متر");
        strings38.add("10 متر");
        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName(" ما المناطق يتشكل عليها ضغط جوي منخفض ؟");
        question39.setCorrect_answer("المناطق الجبلية");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("المناطق الجبلية");
        strings39.add("الماء صيفا");
        strings39.add("اليابس شتاء");
        strings39.add("المناطق المنخفضة");
        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("ما نطاق الضغط الذي يمتد بين دائرتي عرض ( . – 5 ) شمال و جنوب خط الاستواء ؟");
        question40.setCorrect_answer("المنخفض الاستوائي");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("المنخفض الاستوائي");
        strings40.add("المرتفع وراء المدارين");
        strings40.add("المنخفض شبه القطبي");
        strings40.add("المرتفع القطبي");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("ما نطاق الضغط الذي يمتد بين دائرتي عرض ( 25 – 30 ) شمال و جنوب خط الاستواء ؟ ");
        question41.setCorrect_answer("المرتفع وراء المدارين");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("المنخفض الاستوائي");
        strings41.add("المرتفع وراء المدارين");
        strings41.add("المنخفض شبه القطبي");
        strings41.add("المرتفع القطبي");
        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("ما نطاق الضغط الذي يمتد بين دائرتي عرض ( 45 – 60 ) شمال و جنوب خط الاستواء ؟ ");
        question42.setCorrect_answer("المنخفض شبه القطبي");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("المنخفض الاستوائي");
        strings42.add("المرتفع وراء المدارين");
        strings42.add("المنخفض شبه القطبي");
        strings42.add("المرتفع القطبي");
        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("ما نطاق الضغط الذي يمتد بين دائرتي عرض ( 75 – 90 ) شمال و جنوب خط الاستواء ؟ ");
        question43.setCorrect_answer("المرتفع القطبي");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("المنخفض الاستوائي");
        strings43.add("المرتفع وراء المدارين");
        strings43.add("المنخفض شبه القطبي");
        strings43.add("المرتفع القطبي");
        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("عم يعبر مفهوم قوة كوروليوس ؟");
        question44.setCorrect_answer("انحراف الرياح والاجسام المنطلقة في الجو");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("قوة الرياح");
        strings44.add("انحراف الرياح والاجسام المنطلقة في الجو");
        strings44.add("الضغط الجوي");
        strings44.add(" سرعة الرياح");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("ماذا نسمي الرياح القادمة من جهة الشرق ؟");
        question45.setCorrect_answer("شرقية");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("شمالية");
        strings45.add("جنوبية");
        strings45.add("شرقية");
        strings45.add("غربية");
        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("ما الرياح التي تهب من مناطق الضغط المرتفع وراء المدارين الى المنخفض الاستوائي ؟ ");
        question46.setCorrect_answer("التجارية");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("التجارية");
        strings46.add("الغربية العكسية");
        strings46.add("القطبية");
        strings46.add("الموسمية");
        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("ما الرياح التي تهب من مناطق الضغط المرتفع وراء المدارين الى المنخفض شبه القطبي ؟");
        question47.setCorrect_answer("الغربية العكسية");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("التجارية");
        strings47.add("الغربية العكسية");
        strings47.add("القطبية");
        strings47.add("المحلية");
        question47.setAnswer_list(strings47);

        Qustion question48 = new Qustion();
        question48.setName("ما الرياح التي تهب من مناطق الضغط المرتفع القطبي الى المنخفض شبه القطبي");
        question48.setCorrect_answer("القطبية");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("التجارية");
        strings48.add("الغربية العكسية");
        strings48.add("القطبية");
        strings48.add("اليومية");
        question48.setAnswer_list(strings48);

        Qustion question49 = new Qustion();
        question49.setName("ما اتجاه الرياح التجارية في النصف الشمالي للكرة الارضية ؟ ");
        question49.setCorrect_answer("شمالية شرقية");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("جنوبية شرقية");
        strings49.add("شمالية شرقية");
        strings49.add("جنوبية غربية");
        strings49.add("شمالية غربية");
        question49.setAnswer_list(strings49);

        Qustion question50 = new Qustion();
        question50.setName("ما اتجاه الرياح التجارية في النصف الجنوبي للكرة الارضية ؟");
        question50.setCorrect_answer("جنوبية شرقية");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("شمالية شرقية");
        strings50.add("جنوبية شرقية");
        strings50.add("جنوبية غربية");
        strings50.add("شمالية غربية");
        question50.setAnswer_list(strings50);

        Qustion question51 = new Qustion();
        question51.setName("ما اتجاه الرياح الغربية العكسية في النصف الشمالي للكرة الارضية ؟");
        question51.setCorrect_answer("جنوبية غربية");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("شمالية شرقية");
        strings51.add("جنوبية شرقية");
        strings51.add("جنوبية غربية");
        strings51.add("شمالية غربية");
        question51.setAnswer_list(strings51);

        Qustion question52 = new Qustion();
        question52.setName("ما اتجاه الرياح الغربية العكسية في النصف الجنوبي للكرة الارضية ؟");
        question52.setCorrect_answer("شمالية غربية");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("شمالية شرقية");
        strings52.add("جنوبية شرقية");
        strings52.add("جنوبية غربية");
        strings52.add("شمالية غربية");
        question52.setAnswer_list(strings52);

        Qustion question53 = new Qustion();
        question53.setName("ما اتجاه الرياح القطبية في النصف الشمالي للكرة الارضية ؟");
        question53.setCorrect_answer("شمالية شرقية");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("شمالية شرقية");
        strings53.add("شمالية غربية");
        strings53.add("جنوبية شرقية");
        strings53.add("جنوبية غربية");
        question53.setAnswer_list(strings53);

        Qustion question54 = new Qustion();
        question54.setName("ما اتجاه الرياح القطبية في النصف الجنوبي للكرة الارضية ؟ ");
        question54.setCorrect_answer("جنوبية شرقية");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("جنوبية غربية");
        strings54.add("شمالية غربية");
        strings54.add("شمالية شرقية");
        strings54.add("جنوبية شرقية");
        question54.setAnswer_list(strings54);

        Qustion question55 = new Qustion();
        question55.setName("على أي المناطق تهب الرياح الموسمية ؟");
        question55.setCorrect_answer("جنوب شرق اسيا");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("شمال شرق اسيا");
        strings55.add("جنوب شرق اسيا");
        strings55.add("شمال غرب اسيا");
        strings55.add("جنوب غرب اسيا");
        question55.setAnswer_list(strings55);

        Qustion question56 = new Qustion();
        question56.setName("ما الرياح التي تهب على مناطق جنوب شرق اسيا ؟");
        question56.setCorrect_answer("الموسمية");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("القطبية");
        strings56.add("الموسمية");
        strings56.add("المحلية");
        strings56.add("اليومية");
        question56.setAnswer_list(strings56);

        Qustion question57 = new Qustion();
        question57.setName("ما الرياح المحلية الحارة التي تهب على مصر و بلاد الشام ؟");
        question57.setCorrect_answer("الخماسين");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("المسترال");
        strings57.add("الطوز");
        strings57.add("الخماسين");
        strings57.add("السيروكو");
        question57.setAnswer_list(strings57);

        Qustion question58 = new Qustion();
        question58.setName("ما الرياح المحلية الباردة التي تهب من جبال الالب وسط اوروبا الى جنوبها ؟");
        question58.setCorrect_answer("المسترال");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("الخماسين");
        strings58.add("السموم");
        strings58.add("الهرمطان");
        strings58.add("المسترال");
        question58.setAnswer_list(strings58);

        Qustion question59 = new Qustion();
        question59.setName(" أي من الرياح التالية تعتبر رياح محلية باردة ؟ ");
        question59.setCorrect_answer("المسترال");
        ArrayList<String> strings59 = new ArrayList<>();
        strings59.add("الخماسين");
        strings59.add("السيروكو");
        strings59.add("المسترال");
        strings59.add("الطوز");
        question59.setAnswer_list(strings59);

        Qustion question60 = new Qustion();
        question60.setName("ما الجبال التي تمتد وسط قارة اوروبا ؟");
        question60.setCorrect_answer("الالب");
        ArrayList<String> strings60 = new ArrayList<>();
        strings60.add("الالب");
        strings60.add("الهيمالايا ");
        strings60.add("روكي");
        strings60.add("الانديز");
        question60.setAnswer_list(strings60);

        Qustion question61 = new Qustion();
        question61.setName("ما المفهوم الذي يطلق على نسمات من الهواء الرطب المنعش التي تهب من البحر الى اليابس نهارا ؟");
        question61.setCorrect_answer("نسيم البحر");
        ArrayList<String> strings61 = new ArrayList<>();
        strings61.add(" نسيم الجبل");
        strings61.add(" نسيم الوادي");
        strings61.add("نسيم البحر");
        strings61.add("نسيم البر");
        question61.setAnswer_list(strings61);

        Qustion question62 = new Qustion();
        question62.setName("ما المفهوم الذي يطلق على نسمات من الهواء الجاف التي تهب من اليابس الى البحر ليلا ؟ ");
        question62.setCorrect_answer("نسيم البر");
        ArrayList<String> strings62 = new ArrayList<>();
        strings62.add("نسيم الوادي");
        strings62.add("نسيم البحر");
        strings62.add("نسيم الجبل");
        strings62.add("نسيم البر");
        question62.setAnswer_list(strings62);

        Qustion question63 = new Qustion();
        question63.setName("ما المفهوم الذي يطلق على نسمات من الهواء التي تهب من الاودية الى سفوح وقمم الجبال نهارا ؟");
        question63.setCorrect_answer("نسيم الوادي");
        ArrayList<String> strings63 = new ArrayList<>();
        strings63.add("نسيم الوادي");
        strings63.add("نسيم الجبل");
        strings63.add("نسيم البر");
        strings63.add("نسيم البحر");
        question63.setAnswer_list(strings63);

        Qustion question64 = new Qustion();
        question64.setName("ما المفهوم الذي يطلق على نسمات من الهواء التي تهب من سفوح وقمم الجبال الى الاودية ليلا ؟");
        question64.setCorrect_answer("نسيم الجبل");
        ArrayList<String> strings64 = new ArrayList<>();
        strings64.add(" نسيم الوادي");
        strings64.add("نسيم الجبل");
        strings64.add("نسيم البحر");
        strings64.add("نسيم البر");
        question64.setAnswer_list(strings64);

        Qustion question65 = new Qustion();
        question65.setName("ما العملية التي تحدث للهواء عند هبوطه من اعلى الى اسفل وتؤدي الى احتكاك و تضاغط جزيئات الهواء ؟");
        question65.setCorrect_answer("التسخين الذاتي");
        ArrayList<String> strings65 = new ArrayList<>();
        strings65.add("الحمل الحراري");
        strings65.add("التسخين الذاتي");
        strings65.add("التوصيل الحراري");
        strings65.add("التجمد الحراري");
        question65.setAnswer_list(strings65);

        Qustion question66 = new Qustion();
        question66.setName("كم يساوي المايكرون ؟");
        question66.setCorrect_answer("1 من 1000ملم");
        ArrayList<String> strings66 = new ArrayList<>();
        strings66.add("1 من 1000ملم");
        strings66.add("1 من 100ملم");
        strings66.add("1 من 100000ملم");
        strings66.add("1 من 10000ملم");
        question66.setAnswer_list(strings66);

        Qustion question67 = new Qustion();
        question67.setName("اذا كانت درجة الحرارة عند نقطة ما على مستوى سطح البحر 30مْ , فكم تكون درجة الحرارة على ارتفاع 6كم من مستوى سطح البحر ؟");
        question67.setCorrect_answer("-10م");
        ArrayList<String> strings67 = new ArrayList<>();
        strings67.add("5م");
        strings67.add("15م");
        strings67.add("20م");
        strings67.add("-10م");
        question67.setAnswer_list(strings67);

        Qustion question68 = new Qustion();
        question68.setName("ما هو السطح الذي تكون فيه نسبة الالبيدو الارضي اعلى ما يكون على سطح الارض ؟");
        question68.setCorrect_answer("الثلوج");
        ArrayList<String> strings68 = new ArrayList<>();
        strings68.add("الغابات");
        strings68.add("الماء");
        strings68.add("السحب الرقيقة");
        strings68.add("الثلوج");
        question68.setAnswer_list(strings68);

        Qustion question69 = new Qustion();
        question69.setName("أي قيم الضغط الجوي الاتية تشكل ضغطا منخفضا ؟");
        question69.setCorrect_answer("1009مليبار");
        ArrayList<String> strings69 = new ArrayList<>();
        strings69.add("1050مليبار");
        strings69.add("1019مليبار");
        strings69.add("1013مليبار");
        strings69.add("1009مليبار");
        question69.setAnswer_list(strings69);

        Qustion question70 = new Qustion();
        question70.setName("لماذا يطلق على المنطقة الاستوائية منطقة الركود الاستوائي ؟");
        question70.setCorrect_answer("لعدم وجود فروقات في درجات الحرارة");
        ArrayList<String> strings70 = new ArrayList<>();
        strings70.add("لانخفاض الضغط الجوي");
        strings70.add(" لغزارة الامطار");
        strings70.add("لكثافة الغطاء النباتي");
        strings70.add("لعدم وجود فروقات في درجات الحرارة");
        question70.setAnswer_list(strings70);

        Qustion question71 = new Qustion();
        question71.setName("ما العلاقة بين كمية التبخر  و كمية التساقط على سطح الارض ؟");
        question71.setCorrect_answer("كمية التبخر هي نفسها كمية التساقط");
        ArrayList<String> strings71 = new ArrayList<>();
        strings71.add("كمية التبخر هي نفسها كمية التساقط");
        strings71.add("كمية التبخر اكبر من كمية التساقط");
        strings71.add("كمية التبخر اقل من كمية التساقط");
        strings71.add("كمية التساقط لا تساوي كمية التبخر");
        question71.setAnswer_list(strings71);


        questions.clear();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        questions.add(question48);
        questions.add(question49);
        questions.add(question50);
        questions.add(question51);
        questions.add(question52);
        questions.add(question53);
        questions.add(question54);
        questions.add(question55);
        questions.add(question56);
        questions.add(question57);
        questions.add(question58);
        questions.add(question59);
        questions.add(question60);
        questions.add(question61);
        questions.add(question62);
        questions.add(question63);
        questions.add(question64);
        questions.add(question65);
        questions.add(question66);
        questions.add(question67);
        questions.add(question68);
        questions.add(question69);
        questions.add(question70);
        questions.add(question71);

        setData(0);
        updateScore(0);
    }

    private void Question_2() {

        Qustion question72 = new Qustion();
        question72.setName("ماذا يطلق على عملية تحول الماء من حالة السيولة الى الحالة الغازية  ؟");
        question72.setCorrect_answer("التبخر");
        ArrayList<String> strings72 = new ArrayList<>();
        strings72.add("التكاثف");
        strings72.add("التبخر");
        strings72.add("الرطوبة");
        strings72.add("التسامي");
        question72.setAnswer_list(strings72);

        Qustion question73 = new Qustion();
        question73.setName("ماذا يطلق على عملية تحول الجليد الى الحالة الغازية مباشرة ؟");
        question73.setCorrect_answer("التسامي");
        ArrayList<String> strings73 = new ArrayList<>();
        strings73.add("التبخر");
        strings73.add("الترسيب");
        strings73.add("التسامي");
        strings73.add("التكاثف");
        question73.setAnswer_list(strings73);

        Qustion question74 = new Qustion();
        question74.setName("فسر سبب زيادة التبخر في المناطق الاستوائية و المدارية ؟");
        question74.setCorrect_answer(" كل ما ذكر");
        ArrayList<String> strings74 = new ArrayList<>();
        strings74.add("ارتفاع الحرارة");
        strings74.add("توفر مصادر الرطوبة");
        strings74.add("سرعة الرياح");
        strings74.add(" كل ما ذكر");
        question74.setAnswer_list(strings74);

        Qustion question75 = new Qustion();
        question75.setName("ماذا يطلق على كمية بخار الماء العالق في الغلاف الجوي و توجد في الهواء بنسب متفاوتة ؟");
        question75.setCorrect_answer("الرطوبة الجوية");
        ArrayList<String> strings75 = new ArrayList<>();
        strings75.add("الرطوبة الجوية");
        strings75.add("الرطوبة المطلقة");
        strings75.add("الرطوبة النسبية");
        strings75.add("الضباب");
        question75.setAnswer_list(strings75);

        Qustion question76 = new Qustion();
        question76.setName("على ماذا يطلق مفهوم  مقدار وزن بخار الماء في حجم معين من الهواء ؟");
        question76.setCorrect_answer("الرطوبة المطلقة");
        ArrayList<String> strings76 = new ArrayList<>();
        strings76.add(" الرطوبة الجوية");
        strings76.add("الرطوبة النسبية");
        strings76.add("الرطوبة المطلقة");
        strings76.add("الندى");
        question76.setAnswer_list(strings76);

        Qustion question77 = new Qustion();
        question77.setName("ماذا يطلق على نسبة بخار الماء الموجود فعلا في الهواء الذي يستطيع الهواء استيعابه على نفس درجة الحرارة ؟");
        question77.setCorrect_answer("الرطوبة النسبية");
        ArrayList<String> strings77 = new ArrayList<>();
        strings77.add("الرطوبة المطلقة");
        strings77.add("الرطوبة الجوية");
        strings77.add("الرطوبة النسبية");
        strings77.add("الضباب");
        question77.setAnswer_list(strings77);

        Qustion question78 = new Qustion();
        question78.setName("ما كمية الرطوبة التي تجعل من الهواء منعشا و لطيفا ؟");
        question78.setCorrect_answer("معتدلة");
        ArrayList<String> strings78 = new ArrayList<>();
        strings78.add("كبيرة");
        strings78.add("معتدلة");
        strings78.add(" قليلة");
        strings78.add(" قليلة جدا");
        question78.setAnswer_list(strings78);

        Qustion question79 = new Qustion();
        question79.setName("متى تكون نسبة الرطوبة في الهواء مزعجة للإنسان ؟");
        question79.setCorrect_answer("( اكثر من 65% )");
        ArrayList<String> strings79 = new ArrayList<>();
        strings79.add("( 40 – 50 % )");
        strings79.add("( 50 – 60 % )");
        strings79.add("( اكثر من 65% )");
        strings79.add("( حوالي 50 % )");
        question79.setAnswer_list(strings79);

        Qustion question80 = new Qustion();
        question80.setName("ماذا يطلق على عملية تحول بخار الماء الى سائل او صلب عندما يتعرض للبرودة ؟");
        question80.setCorrect_answer("التكاثف");
        ArrayList<String> strings80 = new ArrayList<>();
        strings80.add("التبخر");
        strings80.add("الترسيب");
        strings80.add("التسامي");
        strings80.add("التكاثف");
        question80.setAnswer_list(strings80);

        Qustion question81 = new Qustion();
        question81.setName("ماذا يطلق على درجة الحرارة التي يصبح عندها الهواء عاجزا عن حمل ما به من بخار ماء ؟");
        question81.setCorrect_answer("نقطة الندى");
        ArrayList<String> strings81 = new ArrayList<>();
        strings81.add("الندى");
        strings81.add("نقطة الندى");
        strings81.add("الصقيع");
        strings81.add("الضباب");
        question81.setAnswer_list(strings81);

        Qustion question82 = new Qustion();
        question82.setName("ماذا يطلق على مفهوم قطرات الماء التي تظهر على سطح الارض و ما عليها من اجسام في الصباح الباكر ؟");
        question82.setCorrect_answer("الندى");
        ArrayList<String> strings82 = new ArrayList<>();
        strings82.add(" نقطة الندى");
        strings82.add("الضباب");
        strings82.add("الصقيع");
        strings82.add("الندى");
        question82.setAnswer_list(strings82);

        Qustion question83 = new Qustion();
        question83.setName("ما فوائد الندى ؟");
        question83.setCorrect_answer("جميع ما ذكر");
        ArrayList<String> strings83 = new ArrayList<>();
        strings83.add("مصدر من مصادر الرطوبة");
        strings83.add("يؤخر عملية النتح");
        strings83.add("يؤخر تبخر الماء من التربة");
        strings83.add("جميع ما ذكر");
        question83.setAnswer_list(strings83);

        Qustion question84 = new Qustion();
        question84.setName("ماذا يطلق على تحول بخار الماء العالق بالهواء  اثناء الليل الى بلورات ثلجية عند انخفاض درجة الحرارة الى ما دون درجة التجمد ؟");
        question84.setCorrect_answer("الصقيع");
        ArrayList<String> strings84 = new ArrayList<>();
        strings84.add("السحب");
        strings84.add("الندى");
        strings84.add("الصقيع");
        strings84.add("الضباب");
        question84.setAnswer_list(strings84);

        Qustion question85 = new Qustion();
        question85.setName(" ما المخاطر الناجمة عن تشكل الصقيع ؟");
        question85.setCorrect_answer("جميع ما ذكر");
        ArrayList<String> strings85 = new ArrayList<>();
        strings85.add("اضعاف نمو النباتات");
        strings85.add("حوادث السير");
        strings85.add("اتلاف انابيب المياه");
        strings85.add("جميع ما ذكر");
        question85.setAnswer_list(strings85);

        Qustion question86 = new Qustion();
        question86.setName("ماذا يطلق على بخار الماء المتكاثف على شكل ذرات مائية صغيرة متطايرة عالقة في الهواء القريب من الارض ؟");
        question86.setCorrect_answer("الضباب");
        ArrayList<String> strings86 = new ArrayList<>();
        strings86.add("الضباب");
        strings86.add("الندى");
        strings86.add("الصقيع");
        strings86.add("السحب");
        question86.setAnswer_list(strings86);

        Qustion question87 = new Qustion();
        question87.setName("ما العوامل التي تساعد على تشكل الضباب ؟");
        question87.setCorrect_answer("ب+ ج");
        ArrayList<String> strings87 = new ArrayList<>();
        strings87.add("سرعة الرياح");
        strings87.add("توفر نسبة عالية من الرطوبة");
        strings87.add("سكون الرياح");
        strings87.add("ب+ ج");
        question87.setAnswer_list(strings87);

        Qustion question88 = new Qustion();
        question88.setName("ماذا يطلق على قطرات الماء الصغيرة او البلورات الثلجية في طبقات الجو العليا بفعل تكاثف بخار الماء ؟");
        question88.setCorrect_answer("السحب");
        ArrayList<String> strings88 = new ArrayList<>();
        strings88.add("الضباب");
        strings88.add("السحب");
        strings88.add("الندى");
        strings88.add("الصقيع");
        question88.setAnswer_list(strings88);

        Qustion question89 = new Qustion();
        question89.setName("أي السحب الاتية  لا يزيد ارتفاعها عن ( 2 كم ) عن سطح الارض ؟");
        question89.setCorrect_answer("المنخفضة");
        ArrayList<String> strings89 = new ArrayList<>();
        strings89.add("المنخفضة");
        strings89.add("متوسطة الارتفاع ");
        strings89.add("المرتفعة");
        strings89.add("السمحاقية");
        question89.setAnswer_list(strings89);

        Qustion question90 = new Qustion();
        question90.setName(" كم يبلغ ارتفاع السحب المنخفضة عن سطح الارض ؟");
        question90.setCorrect_answer("2 كم");
        ArrayList<String> strings90 = new ArrayList<>();
        strings90.add("5 كم");
        strings90.add("7 كم");
        strings90.add("12 كم");
        strings90.add("2 كم");
        question90.setAnswer_list(strings90);

        Qustion question91 = new Qustion();
        question91.setName("أي السحب الاتية  يتراوح ارتفاعها ما بين( 2 – 7  كم ) عن سطح الارض ؟");
        question91.setCorrect_answer("متوسطة الارتفاع");
        ArrayList<String> strings91 = new ArrayList<>();
        strings91.add("المنخفضة");
        strings91.add("متوسطة الارتفاع");
        strings91.add("المرتفعة");
        strings91.add("الطبقية");
        question91.setAnswer_list(strings91);

        Qustion question92 = new Qustion();
        question92.setName("كم يبلغ ارتفاع السحب متوسطة الارتفاع عن سطح الارض ؟");
        question92.setCorrect_answer("( 2 – 7 كم )");
        ArrayList<String> strings92 = new ArrayList<>();
        strings92.add("( . – 2 كم )");
        strings92.add("( 3 – 5 كم )");
        strings92.add("( 2 – 7 كم )");
        strings92.add("( 7 – 12 كم )");
        question92.setAnswer_list(strings92);

        Qustion question93 = new Qustion();
        question93.setName("أي السحب الاتية هي التي يتراوح ارتفاعها ما بين ( 7 – 12 كم ) عن سطح الارض ؟");
        question93.setCorrect_answer("المرتفعة");
        ArrayList<String> strings93 = new ArrayList<>();
        strings93.add("الركامية");
        strings93.add("المنخفضة");
        strings93.add("متوسطة الارتفاع");
        strings93.add("المرتفعة");
        question93.setAnswer_list(strings93);

        Qustion question94 = new Qustion();
        question94.setName("كم يبلغ ارتفاع السحب المرتفعة عن سطح الارض ؟");
        question94.setCorrect_answer("( 7 – 12 كم )");
        ArrayList<String> strings94 = new ArrayList<>();
        strings94.add("( 2 – 3  كم )");
        strings94.add("( يزيد عن 2 كم )");
        strings94.add("( 2 – 7 كم )");
        strings94.add("( 7 – 12 كم )");
        question94.setAnswer_list(strings94);

        Qustion question95 = new Qustion();
        question95.setName("أي السحب الاتية يصنف من  الامثلة السحب المنخفضة ؟");
        question95.setCorrect_answer("المزن الطبقي");
        ArrayList<String> strings95 = new ArrayList<>();
        strings95.add("المزن الطبقي");
        strings95.add("الركام المتوسط");
        strings95.add("السمحاق الركامي");
        strings95.add(" السمحاق الطبقي");
        question95.setAnswer_list(strings95);

        Qustion question96 = new Qustion();
        question96.setName("أي السحب الاتية يصنف من السحب متوسطة الارتفاع ؟");
        question96.setCorrect_answer("الركام المتوسط");
        ArrayList<String> strings96 = new ArrayList<>();
        strings96.add("المزن الطبقي");
        strings96.add("الركام المتوسط");
        strings96.add("السمحاق الركامي");
        strings96.add(" السمحاق الطبقي");
        question96.setAnswer_list(strings96);

        Qustion question97 = new Qustion();
        question97.setName("أي السحب الاتية يصنف من السحب المرتفعة ؟");
        question97.setCorrect_answer("السمحافية");
        ArrayList<String> strings97 = new ArrayList<>();
        strings97.add("المزن الطبقي");
        strings97.add("الركام المتوسط");
        strings97.add("السمحافية");
        strings97.add("الطبقية");
        question97.setAnswer_list(strings97);

        Qustion question98 = new Qustion();
        question98.setName("ما السحب التي تؤدي الى سقوط الامطار و الثلوج و تكون مصحوبة بالبرق و الرعد ؟");
        question98.setCorrect_answer("المنخفضة");
        ArrayList<String> strings98 = new ArrayList<>();
        strings98.add("المنخفضة");
        strings98.add("متوسطة الارتفاع");
        strings98.add("المرتفعة");
        strings98.add("السمحاقية");
        question98.setAnswer_list(strings98);

        Qustion question99 = new Qustion();
        question99.setName("ما السحب التي تؤدي الى سقوط امطار خفيفة ؟");
        question99.setCorrect_answer("متوسطة الارتفاع");
        ArrayList<String> strings99 = new ArrayList<>();
        strings99.add(" المنخفضة");
        strings99.add("المرتفعة");
        strings99.add("السمحاقية");
        strings99.add("متوسطة الارتفاع");
        question99.setAnswer_list(strings99);

        Qustion question100 = new Qustion();
        question100.setName("ما السحب التي لا تصل امطارها الى سطح الارض ؟");
        question100.setCorrect_answer("المرتفعة");
        ArrayList<String> strings100 = new ArrayList<>();
        strings100.add("المنخفضة");
        strings100.add("المرتفعة");
        strings100.add("متوسطة الارتفاع");
        strings100.add("الطبقية");
        question100.setAnswer_list(strings100);

        Qustion question101 = new Qustion();
        question101.setName("كم تبلغ نسبة الطاقة الحرارية التي يزودها الاشعاع الشمسي للأرض ؟");
        question101.setCorrect_answer("99.97 %");
        ArrayList<String> strings101 = new ArrayList<>();
        strings101.add("99.97 %");
        strings101.add("97.99 %");
        strings101.add("98.96 %");
        strings101.add("96.97 %");
        question101.setAnswer_list(strings101);

        Qustion question102 = new Qustion();
        question102.setName("ما هو شكل الهطول الغالب في فلسطين ؟");
        question102.setCorrect_answer("الامطار");
        ArrayList<String> strings102 = new ArrayList<>();
        strings102.add("الامطار");
        strings102.add("الثلوج");
        strings102.add("البرد");
        strings102.add("الضباب");
        question102.setAnswer_list(strings102);

        Qustion question103 = new Qustion();
        question103.setName("أي انواع الامطار الاتية تحدث عندما تهب الرياح البحرية الرطبة و تصطدم بالجبال ؟");
        question103.setCorrect_answer("التضاريسية");
        ArrayList<String> strings103 = new ArrayList<>();
        strings103.add("التصعيدية");
        strings103.add("التضاريسية");
        strings103.add("المنخفضات الجوية");
        strings103.add("الحملية");
        question103.setAnswer_list(strings103);

        Qustion question104 = new Qustion();
        question104.setName("أي المناطق التي تقع في منطقة ظل المطر في فلسطين ؟");
        question104.setCorrect_answer("الاغوار");
        ArrayList<String> strings104 = new ArrayList<>();
        strings104.add("المرتفعات الجبلية");
        strings104.add("النقب");
        strings104.add("الاغوار");
        strings104.add("السهل الساحلي");
        question104.setAnswer_list(strings104);

        Qustion question105 = new Qustion();
        question105.setName("اي المناطق التي تتعرض لأمطار المنخفضات الجوية ؟");
        question105.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings105 = new ArrayList<>();
        strings105.add("حوض البحر المتوسط");
        strings105.add("غرب اوروبا");
        strings105.add("خليج المكسيك");
        strings105.add("كل ما ذكر");
        question105.setAnswer_list(strings105);

        Qustion question106 = new Qustion();
        question106.setName("ما نوع الأمطار التي تسود في العروض الوسطى ( المنطقة المعتدلة ) ؟");
        question106.setCorrect_answer("المنخفضات الجوية");
        ArrayList<String> strings106 = new ArrayList<>();
        strings106.add("التصعيدية");
        strings106.add("التضاريسية");
        strings106.add("المنخفضات الجوية");
        strings106.add("ليس مما ذكر");
        question106.setAnswer_list(strings106);

        Qustion question107 = new Qustion();
        question107.setName("اين تسود الأمطار التصعيدية ؟");
        question107.setCorrect_answer("المناطق الاستوائية");
        ArrayList<String> strings107 = new ArrayList<>();
        strings107.add("المناطق القطبية");
        strings107.add("المناطق الجبلية");
        strings107.add("مناطق الاغوار");
        strings107.add("المناطق الاستوائية");
        question107.setAnswer_list(strings107);

        Qustion question108 = new Qustion();
        question108.setName("فسر اسباب تشكل الأمطار التصعيدية في المناطق الاستوائية و المدارية ؟");
        question108.setCorrect_answer("أ + ب");
        ArrayList<String> strings108 = new ArrayList<>();
        strings108.add("شدة التسخين");
        strings108.add("نشاط التيارات الصاعدة");
        strings108.add("انخفاض الحرارة");
        strings108.add("أ + ب");
        question108.setAnswer_list(strings108);

        Qustion question109 = new Qustion();
        question109.setName(" كم تبلغ كمية الامطار الساقطة في المناطق غزيرة الامطار ؟");
        question109.setCorrect_answer("1500اكثر من ملم/ سنويا");
        ArrayList<String> strings109 = new ArrayList<>();
        strings109.add("1500اكثر من ملم/ سنويا");
        strings109.add("500 – 1500 ملم/ سنويا");
        strings109.add("اقل من 300 ملم/سنويا");
        strings109.add("250ملم/سنويا");
        question109.setAnswer_list(strings109);

        Qustion question110 = new Qustion();
        question110.setName("كم تبلغ كمية الامطار الساقطة في المناطق متوسطة الامطار ؟");
        question110.setCorrect_answer("500 – 1500 ملم/ سنويا");
        ArrayList<String> strings110 = new ArrayList<>();
        strings110.add("1500ملم/ سنويا");
        strings110.add("500 – 1500 ملم/ سنويا");
        strings110.add("اقل من 300 ملم/سنويا");
        strings110.add("300ملم/سنويا");
        question110.setAnswer_list(strings110);

        Qustion question111 = new Qustion();
        question111.setName("كم تبلغ كمية الامطار الساقطة في المناطق نادرة الامطار ؟");
        question111.setCorrect_answer("اقل من 300 ملم/سنويا");
        ArrayList<String> strings111 = new ArrayList<>();
        strings111.add("1500ملم/ سنويا");
        strings111.add("1000 ملم/ سنويا");
        strings111.add("2000 ملم/سنويا");
        strings111.add("اقل من 300 ملم/سنويا");
        question111.setAnswer_list(strings111);

        Qustion question112 = new Qustion();
        question112.setName("ما تصنيف منطقة حوض البحر المتوسط من حيث كمية الامطار ؟");
        question112.setCorrect_answer("متوسطة");
        ArrayList<String> strings112 = new ArrayList<>();
        strings112.add("غزيرة جدا");
        strings112.add("غزيرة");
        strings112.add("متوسطة");
        strings112.add("نادرة");
        question112.setAnswer_list(strings112);

        Qustion question113 = new Qustion();
        question113.setName("أي المناطق الاتية تصنف مناطق غزيرة الامطار ؟");
        question113.setCorrect_answer("أ + ب");
        ArrayList<String> strings113 = new ArrayList<>();
        strings113.add("المناطق الاستوائية");
        strings113.add("شرق القارات");
        strings113.add("غرب القارات");
        strings113.add("أ + ب");
        question113.setAnswer_list(strings113);

        Qustion question114 = new Qustion();
        question114.setName("اي المناطق الاتية تصنف مناطق متوسطة الامطار ؟");
        question114.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings114 = new ArrayList<>();
        strings114.add("حوض البحر المتوسط");
        strings114.add("غرب القارات");
        strings114.add("وسط القارات");
        strings114.add("كل ما ذكر");
        question114.setAnswer_list(strings114);

        Qustion question115 = new Qustion();
        question115.setName("ماذا يطلق على تحول قطرات الماء الى كريات صغيرة من الجليد ؟");
        question115.setCorrect_answer("البرد");
        ArrayList<String> strings115 = new ArrayList<>();
        strings115.add("الصقيع");
        strings115.add("البرد");
        strings115.add("الثلج");
        strings115.add("الامطار");
        question115.setAnswer_list(strings115);

        Qustion question116 = new Qustion();
        question116.setName("اين تسود ظاهرة البرد ؟");
        question116.setCorrect_answer("في المناطق المعتدلة و المدارية");
        ArrayList<String> strings116 = new ArrayList<>();
        strings116.add("في المناطق القطبية و المعتدلة");
        strings116.add("في المناطق المعتدلة و القطبية");
        strings116.add("في المناطق المدارية و الاستوائية");
        strings116.add("في المناطق المعتدلة و المدارية");
        question116.setAnswer_list(strings116);

        Qustion question117 = new Qustion();
        question117.setName("أي المناطق التي لا يسقط فيها البرد ؟");
        question117.setCorrect_answer("القطبية");
        ArrayList<String> strings117 = new ArrayList<>();
        strings117.add("الاستوائية");
        strings117.add("المدارية");
        strings117.add("المعتدلة");
        strings117.add("القطبية");
        question117.setAnswer_list(strings117);

        Qustion question118 = new Qustion();
        question118.setName("ما سبب تساقط البرد في المناطق المعتدلة و المدارية ؟");
        question118.setCorrect_answer("التيارات الهوائية الصاعدة");
        ArrayList<String> strings118 = new ArrayList<>();
        strings118.add("التيارات الهوائية الهابطة");
        strings118.add("التيارات الهوائية الصاعدة");
        strings118.add("ارتفاع الحرارة");
        strings118.add("انخفاض الحرارة");
        question118.setAnswer_list(strings118);

        Qustion question119 = new Qustion();
        question119.setName("ماذا يطلق على تحول قطرات الماء في السحب الى بلورات رقيقة من الجليد ؟");
        question119.setCorrect_answer("الثلج");
        ArrayList<String> strings119 = new ArrayList<>();
        strings119.add("الصقيع");
        strings119.add("البرد");
        strings119.add("الثلج");
        strings119.add("الامطار");
        question119.setAnswer_list(strings119);

        Qustion question120 = new Qustion();
        question120.setName("ما الجبال التي تمتد في وسط قارة اسيا ؟");
        question120.setCorrect_answer("الهيمالايا");
        ArrayList<String> strings120 = new ArrayList<>();
        strings120.add("الالب");
        strings120.add("روكي");
        strings120.add("الهيمالايا");
        strings120.add("اطلس");
        question120.setAnswer_list(strings120);

        Qustion question121 = new Qustion();
        question121.setName("ماذا يطلق على سلسلة الغيوم التي يحدث فيها تفريغ كهربائي بين الشحنات السالبة و الموجبة ؟");
        question121.setCorrect_answer("العواصف الرعدية");
        ArrayList<String> strings121 = new ArrayList<>();
        strings121.add("العواصف الرعدية");
        strings121.add("الكتل الهوائية");
        strings121.add("الجبهات الهوائية");
        strings121.add("الاعاصير المدارية");
        question121.setAnswer_list(strings121);

        Qustion question122 = new Qustion();
        question122.setName("بماذا تمتاز المرحلة الاولى من مراحل تشكل العواصف الرعدية ؟");
        question122.setCorrect_answer("نشاط التيارات الهوائية الصاعدة");
        ArrayList<String> strings122 = new ArrayList<>();
        strings122.add("البرق و الرعد و سقوط الامطار");
        strings122.add("نشاط التيارات الهوائية الصاعدة");
        strings122.add("تلاشي الغيوم");
        strings122.add("هبوب الرياح العاصفة");
        question122.setAnswer_list(strings122);

        Qustion question123 = new Qustion();
        question123.setName("في أي مراحل العواصف الرعدية تنشط التيارات الهوائية الصاعدة و عملية التكاثف ؟");
        question123.setCorrect_answer("المرحلة الثانية");
        ArrayList<String> strings123 = new ArrayList<>();
        strings123.add("المرحلة الاولى");
        strings123.add("المرحلة الثانية");
        strings123.add("المرحلة الثالثة");
        strings123.add("المرحلة الرابعة");
        question123.setAnswer_list(strings123);

        Qustion question124 = new Qustion();
        question124.setName("ما المرحلة التي يرافق فيها العواصف الرعدية كل من البرق و الرعد و الصاعقة ؟");
        question124.setCorrect_answer("المرحلة الثانية");
        ArrayList<String> strings124 = new ArrayList<>();
        strings124.add("المرحلة الثالثة");
        strings124.add("المرحلة الأولى");
        strings124.add("المرحلة الثانية");
        strings124.add("المرحلة الرابعة");
        question124.setAnswer_list(strings124);

        Qustion question125 = new Qustion();
        question125.setName("في أي مرحلة يحدث عدم استقرار في حالة الجو ؟");
        question125.setCorrect_answer("تكوين الغيوم");
        ArrayList<String> strings125 = new ArrayList<>();
        strings125.add("تكوين الغيوم");
        strings125.add("النضج");
        strings125.add("تلاشي الغيوم");
        strings125.add("تبدد الغيوم");
        question125.setAnswer_list(strings125);

        Qustion question126 = new Qustion();
        question126.setName("ماذا يطلق على الشرارة الكهربائية الناتجة عن التفريغ الكهربائي الناجم عن تماس بين الشحنات السالبة و الموجبة داخل السحابة او بين سحابتين ؟");
        question126.setCorrect_answer("البرق");
        ArrayList<String> strings126 = new ArrayList<>();
        strings126.add("الرعد");
        strings126.add("الصاعقة");
        strings126.add("البرق");
        strings126.add("العاصفة الرعدية");
        question126.setAnswer_list(strings126);

        Qustion question127 = new Qustion();
        question127.setName("ماذا يقصد بالوميض الذي يمتد من الارض الى اعلى بسبب التفريغ الكهربائي بين اسفل السحابة ذات الشحنات السالبة و سطح الارض ذات الشحنات الموجبة ؟ ");
        question127.setCorrect_answer("الصاعقة");
        ArrayList<String> strings127 = new ArrayList<>();
        strings127.add("الرعد");
        strings127.add("البرق");
        strings127.add("الصاعقة");
        strings127.add("الاعاصير المدارية");
        question127.setAnswer_list(strings127);

        Qustion question128 = new Qustion();
        question128.setName("ما الصوت الناجم عن تمدد الهواء و تقلصه نتيجة لتسخينه بفعل البرق ؟");
        question128.setCorrect_answer("الرعد");
        ArrayList<String> strings128 = new ArrayList<>();
        strings128.add("الرعد");
        strings128.add("البرق");
        strings128.add("الصاعقة");
        strings128.add("الشرارة");
        question128.setAnswer_list(strings128);

        Qustion question129 = new Qustion();
        question129.setName(" بماذا تمتاز المرحلة الثالثة من العواصف الرعدية ؟");
        question129.setCorrect_answer("توقف التيارات الصاعدة وتلاشي الغيوم");
        ArrayList<String> strings129 = new ArrayList<>();
        strings129.add("البرق و الرعد و سقوط الامطار");
        strings129.add("توقف التيارات الصاعدة وتلاشي الغيوم");
        strings129.add("تشكل الغيوم");
        strings129.add("هبوب رياح عاصفة");
        question129.setAnswer_list(strings129);

        Qustion question130 = new Qustion();
        question130.setName("ما المخاطر الناجمة عن العواصف الرعدية ؟");
        question130.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings130 = new ArrayList<>();
        strings130.add("اعطاب الاجهزة الكهربائية");
        strings130.add("اشتعال الحرائق");
        strings130.add("حدوث الحروق و الوفاة للإنسان و الحيوان");
        strings130.add("كل ما ذكر");
        question130.setAnswer_list(strings130);

        Qustion question131 = new Qustion();
        question131.setName("ما المفهوم الذي يعبر عن الهواء المتجانس في خصائصه المناخية من حرارة و رطوبة و غيرها ؟");
        question131.setCorrect_answer("الكتل الهوائية");
        ArrayList<String> strings131 = new ArrayList<>();
        strings131.add("الجبهات الهوائية");
        strings131.add("الاعاصير المدارية");
        strings131.add("الكتل الهوائية");
        strings131.add("العواصف الرعدية");
        question131.setAnswer_list(strings131);

        Qustion question132 = new Qustion();
        question132.setName("ما المفهوم الذي يعبر عن الحد الفاصل عند التقاء كتلة هوائية باردة مع كتلة هوائية دافئة ؟");
        question132.setCorrect_answer("الجبهة الهوائية");
        ArrayList<String> strings132 = new ArrayList<>();
        strings132.add("الجبهة الهوائية");
        strings132.add("الكتلة الهوائية");
        strings132.add("المنخفض الجوي");
        strings132.add("المرتفع الجوي");
        question132.setAnswer_list(strings132);

        Qustion question133 = new Qustion();
        question133.setName("ما الجبهة الهوائية التي يندفع فيها الهواء البارد نحو الهواء الدافئ ويحل مكانه ؟");
        question133.setCorrect_answer("الباردة");
        ArrayList<String> strings133 = new ArrayList<>();
        strings133.add("الباردة");
        strings133.add("الدافئة");
        strings133.add("المستقرة");
        strings133.add("الممتلئة");
        question133.setAnswer_list(strings133);

        Qustion question134 = new Qustion();
        question134.setName("ما الجبهة الهوائية التي تتكون عندما تسيطر فيها الكتلة الهوائية الدافئة و تحل محل الباردة ؟");
        question134.setCorrect_answer("الدافئة");
        ArrayList<String> strings134 = new ArrayList<>();
        strings134.add("المستقرة");
        strings134.add("الباردة");
        strings134.add("الدافئة");
        strings134.add("الممتلئة");
        question134.setAnswer_list(strings134);

        Qustion question135 = new Qustion();
        question135.setName("ما الجبهة الهوائية التي تتكون فيها الغيوم التراكمية ( المزن الركامي ) و يصحبها عواصف رعدية ؟");
        question135.setCorrect_answer("الباردة");
        ArrayList<String> strings135 = new ArrayList<>();
        strings135.add("الممتلئة");
        strings135.add("الدافئة");
        strings135.add("المستقرة");
        strings135.add("الباردة");
        question135.setAnswer_list(strings135);

        Qustion question136 = new Qustion();
        question136.setName("ما الجبهة التي تحدث عندما يتحرك الهواء على جانبي الجبهة بالاتجاه الموازي لها ؟");
        question136.setCorrect_answer("المستقرة");
        ArrayList<String> strings136 = new ArrayList<>();
        strings136.add("المستقرة");
        strings136.add("الممتلئة");
        strings136.add("الدافئة");
        strings136.add("الباردة");
        question136.setAnswer_list(strings136);

        Qustion question137 = new Qustion();
        question137.setName("بماذا يرمز للضغط الجوي المرتفع ؟");
        question137.setCorrect_answer("H");
        ArrayList<String> strings137 = new ArrayList<>();
        strings137.add("M");
        strings137.add("N");
        strings137.add("L");
        strings137.add("H");
        question137.setAnswer_list(strings137);

        Qustion question138 = new Qustion();
        question138.setName("بماذا يرمز للضغط الجوي المنخفض ؟");
        question138.setCorrect_answer("L");
        ArrayList<String> strings138 = new ArrayList<>();
        strings138.add("H");
        strings138.add("L");
        strings138.add("M");
        strings138.add("N");
        question138.setAnswer_list(strings138);

        Qustion question139 = new Qustion();
        question139.setName("كيف تكون حركة الرياح في المنخفض الجوي");
        question139.setCorrect_answer("من الاطراف نحو المركز");
        ArrayList<String> strings139 = new ArrayList<>();
        strings139.add("من المركز نحو الاطراف");
        strings139.add("من الاطراف نحو المركز");
        strings139.add("حركة رأسية");
        strings139.add("حركة افقية");
        question139.setAnswer_list(strings139);

        Qustion question140 = new Qustion();
        question140.setName("كيف تكون حركة الرياح في المنخفض الجوي في النصف الشمالي للكرة الارضية ؟");
        question140.setCorrect_answer("عكس اتجاه عقارب الساعة");
        ArrayList<String> strings140 = new ArrayList<>();
        strings140.add("عكس اتجاه عقارب الساعة");
        strings140.add("مع اتجاه عقارب الساعة");
        strings140.add("افقية");
        strings140.add("رأسية");
        question140.setAnswer_list(strings140);

        Qustion question141 = new Qustion();
        question141.setName("كيف تكون حركة الرياح في المرتفع الجوي ؟");
        question141.setCorrect_answer("من المركز نحو الاطراف");
        ArrayList<String> strings141 = new ArrayList<>();
        strings141.add("رأسية");
        strings141.add("افقية");
        strings141.add("من المركز نحو الاطراف");
        strings141.add("من الاطراف نحو المركز");
        question141.setAnswer_list(strings141);

        Qustion question142 = new Qustion();
        question142.setName("متى يحدث استقرار في حالة الجو ؟");
        question142.setCorrect_answer("في المرتفع الجوي");
        ArrayList<String> strings142 = new ArrayList<>();
        strings142.add("في المرتفع الجوي");
        strings142.add("في المنخفض الجوي");
        strings142.add("في العواصف الرعدية");
        strings142.add("في الاعاصير المدارية");
        question142.setAnswer_list(strings142);

        questions.clear();
        questions.add(question72);
        questions.add(question73);
        questions.add(question74);
        questions.add(question75);
        questions.add(question76);
        questions.add(question77);
        questions.add(question78);
        questions.add(question79);
        questions.add(question80);
        questions.add(question81);
        questions.add(question82);
        questions.add(question83);
        questions.add(question84);
        questions.add(question85);
        questions.add(question86);
        questions.add(question87);
        questions.add(question88);
        questions.add(question89);
        questions.add(question90);
        questions.add(question91);
        questions.add(question92);
        questions.add(question93);
        questions.add(question94);
        questions.add(question95);
        questions.add(question96);
        questions.add(question97);
        questions.add(question98);
        questions.add(question99);
        questions.add(question100);
        questions.add(question101);
        questions.add(question102);
        questions.add(question103);
        questions.add(question104);
        questions.add(question105);
        questions.add(question106);
        questions.add(question107);
        questions.add(question108);
        questions.add(question109);
        questions.add(question110);
        questions.add(question111);
        questions.add(question112);
        questions.add(question113);
        questions.add(question114);
        questions.add(question115);
        questions.add(question116);
        questions.add(question117);
        questions.add(question118);
        questions.add(question119);
        questions.add(question120);
        questions.add(question121);
        questions.add(question122);
        questions.add(question123);
        questions.add(question124);
        questions.add(question125);
        questions.add(question126);
        questions.add(question127);
        questions.add(question128);
        questions.add(question129);
        questions.add(question130);
        questions.add(question131);
        questions.add(question132);
        questions.add(question133);
        questions.add(question134);
        questions.add(question135);
        questions.add(question136);
        questions.add(question137);
        questions.add(question138);
        questions.add(question139);
        questions.add(question140);
        questions.add(question141);
        questions.add(question142);
        setData(0);
        updateScore(0);

    }

    private void Question_3() {


        Qustion question143 = new Qustion();
        question143.setName("ما العناصر التي صنفت على اساسها الاقاليم المناخية ؟");
        question143.setCorrect_answer("الحرارة و الامطار و الضغط و الرياح");
        ArrayList<String> strings143 = new ArrayList<>();
        strings143.add("الحرارة و الامطار و الضغط و الرياح");
        strings143.add("التضاريس");
        strings143.add("الكثافة السكانية");
        strings143.add("النشاط الاقتصادي للسكان");
        question143.setAnswer_list(strings143);

        Qustion question144 = new Qustion();
        question144.setName("ماذا يطلق على المناطق التي تتشابه في خصائصها المناخية ؟");
        question144.setCorrect_answer("الاقليم المناخي");
        ArrayList<String> strings144 = new ArrayList<>();
        strings144.add("الاقليم النباتي");
        strings144.add("الاقليم المناخي");
        strings144.add("الاقليم الصناعي");
        strings144.add("الاقليم التجاري");
        question144.setAnswer_list(strings144);

        Qustion question145 = new Qustion();
        question145.setName("ما المناطق المتصلة او المنفصلة من الارض التي تتشابه في خصائصها المناخية ؟");
        question145.setCorrect_answer("الاقليم المناخي");
        ArrayList<String> strings145 = new ArrayList<>();
        strings145.add("الاقليم النباتي");
        strings145.add("الاقليم المناخي");
        strings145.add("الاقليم الصناعي");
        strings145.add("الاقليم التجاري");
        question145.setAnswer_list(strings145);

        Qustion question146 = new Qustion();
        question146.setName("أي المناخات الحارة له امتداد في فلسطين ؟");
        question146.setCorrect_answer("الصحراوي");
        ArrayList<String> strings146 = new ArrayList<>();
        strings146.add(" الاستوائي");
        strings146.add("المداري");
        strings146.add("الموسمي ");
        strings146.add("الصحراوي");
        question146.setAnswer_list(strings146);

        Qustion question147 = new Qustion();
        question147.setName("ماذا يطلق على النطاقات المناخية التي تتشابه في ارتفاع معدل حرارتها بحيث لا تقل في أي شهر عن 18مْ ؟");
        question147.setCorrect_answer("الاقاليم الحارة");
        ArrayList<String> strings147 = new ArrayList<>();
        strings147.add("الاقاليم الباردة");
        strings147.add("الاقاليم المعتدلة");
        strings147.add("الاقاليم الحارة");
        strings147.add("ليس مما ذكر");
        question147.setAnswer_list(strings147);

        Qustion question148 = new Qustion();
        question148.setName("كم يبلغ معدل الحرارة في أي شهر من الشهور في الاقاليم الحارة ؟");
        question148.setCorrect_answer("18 درجة مئوية");
        ArrayList<String> strings148 = new ArrayList<>();
        strings148.add("22 درجة مئوية");
        strings148.add("20 درجة مئوية");
        strings148.add("5 درجة مئوية");
        strings148.add("18 درجة مئوية");
        question148.setAnswer_list(strings148);

        Qustion question149 = new Qustion();
        question149.setName("ما الامتداد الفلكي للمناخ الاستوائي الى الشمال و الجنوب من خط الاستواء ؟");
        question149.setCorrect_answer("( 0 – 5 )");
        ArrayList<String> strings149 = new ArrayList<>();
        strings149.add("( 0 – 5 )");
        strings149.add("( 0 – 3 )");
        strings149.add("( 0 – 20 )");
        strings149.add("( 0 – 25 ) ");
        question149.setAnswer_list(strings149);

        Qustion question150 = new Qustion();
        question150.setName("ما الاقليم المناخي الذي يمتد بين دائرتي عرض ( . – 5 ) شمال و جنوب خط الاستواء ؟");
        question150.setCorrect_answer("الاستوائي");
        ArrayList<String> strings150 = new ArrayList<>();
        strings150.add("المعتدل");
        strings150.add("الموسمي");
        strings150.add("الاستوائي");
        strings150.add("الصحراوي");
        question150.setAnswer_list(strings150);

        Qustion question151 = new Qustion();
        question151.setName("ما الاقليم المناخي الذي يظهر في حوض نهر الكونغو و ساحل غينيا في افريقيا ؟");
        question151.setCorrect_answer("الاستوائي");
        ArrayList<String> strings151 = new ArrayList<>();
        strings151.add("الاستوائي");
        strings151.add("المداري");
        strings151.add("الموسمي");
        strings151.add("الصحراوي");
        question151.setAnswer_list(strings151);

        Qustion question152 = new Qustion();
        question152.setName("ما الاقليم المناخي الذي يظهر في كل من هضبة البحيرات الاستوائية و جنوب الصومال ؟");
        question152.setCorrect_answer("الاستوائي");
        ArrayList<String> strings152 = new ArrayList<>();
        strings152.add("الاستوائي");
        strings152.add("المداري");
        strings152.add("الموسمي");
        strings152.add("الصحراوي");
        question152.setAnswer_list(strings152);

        Qustion question153 = new Qustion();
        question153.setName("ما الاقليم المناخي الذي يظهر في كل من اندونيسيا و ماليزيا في اسيا ؟");
        question153.setCorrect_answer("الاستوائي");
        ArrayList<String> strings153 = new ArrayList<>();
        strings153.add("المداري");
        strings153.add("الموسمي");
        strings153.add("الصحراوي");
        strings153.add("الاستوائي");
        question153.setAnswer_list(strings153);

        Qustion question154 = new Qustion();
        question154.setName("ما الاقليم الذي لا يقل فيه معدل درجة الحرارة في أي شهر من الشهور عن 22 درجة مئوية ؟");
        question154.setCorrect_answer("الاستوائي");
        ArrayList<String> strings154 = new ArrayList<>();
        strings154.add("الموسمي");
        strings154.add("المداري");
        strings154.add("الاستوائي");
        strings154.add("الصحراوي");
        question154.setAnswer_list(strings154);

        Qustion question155 = new Qustion();
        question155.setName("ما الاقليم الذي ينخفض فيه المدى الحراري السنوي بحيث لا يتجاوز ( 5مْ )بسبب تساوي ساعات الليل و النهار ؟");
        question155.setCorrect_answer("الاستوائي");
        ArrayList<String> strings155 = new ArrayList<>();
        strings155.add("الصحراوي");
        strings155.add("الاستوائي");
        strings155.add("المداري");
        strings155.add("الموسمي");
        question155.setAnswer_list(strings155);

        Qustion question156 = new Qustion();
        question156.setName("في أي اقليم ينخفض المدى الحراري اليومي عن ( 10 درجات مئوية ) ؟");
        question156.setCorrect_answer("الاستوائي");
        ArrayList<String> strings156 = new ArrayList<>();
        strings156.add("المداري");
        strings156.add("الموسمي");
        strings156.add("الصحراوي");
        strings156.add("الاستوائي");
        question156.setAnswer_list(strings156);

        Qustion question157 = new Qustion();
        question157.setName("ما سبب عدم زيادة المدى الحراري اليومي في الاقليم المناخي الاستوائي عن ( 10درجة مئوية ) ؟");
        question157.setCorrect_answer("كثافة الغيوم");
        ArrayList<String> strings157 = new ArrayList<>();
        strings157.add("كثافة الغطاء النباتي");
        strings157.add("تساوي ساعات الليل و النهار");
        strings157.add("كثافة الغيوم");
        strings157.add("وجود المحيطات");
        question157.setAnswer_list(strings157);

        Qustion question158 = new Qustion();
        question158.setName("كم تبلغ نسبة  رطوبة الهواء في المناخ الاستوائي ؟");
        question158.setCorrect_answer("80 %");
        ArrayList<String> strings158 = new ArrayList<>();
        strings158.add("30 %");
        strings158.add("40 %");
        strings158.add("60 %");
        strings158.add("80 %");
        question158.setAnswer_list(strings158);

        Qustion question159 = new Qustion();
        question159.setName("كم يصل معدل الامطار في اقليم المناخ الاستوائي ؟");
        question159.setCorrect_answer("اكثر من 1500ملم/سنويا");
        ArrayList<String> strings159 = new ArrayList<>();
        strings159.add(" اقل من300 ملم/سنويا");
        strings159.add("500 – 1500 ملم/سنويا");
        strings159.add("اكثر من 1500ملم/سنويا");
        strings159.add("250ملم/سنويا");
        question159.setAnswer_list(strings159);

        Qustion question160 = new Qustion();
        question160.setName("ما نوع الامطار التي تتساقط على اقليم المناخ الاستوائي ؟");
        question160.setCorrect_answer("تصعيدية");
        ArrayList<String> strings160 = new ArrayList<>();
        strings160.add("تضاريسية");
        strings160.add("تصعيدية");
        strings160.add("منخفضات جوية");
        strings160.add("كل ما ذكر");
        question160.setAnswer_list(strings160);

        Qustion question161 = new Qustion();
        question161.setName("لماذا يسيطر على اقليم المناخ الاستوائي ضغط جوي منخفض؟");
        question161.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings161 = new ArrayList<>();
        strings161.add("ارتفاع الحرارة");
        strings161.add("ارتفاع نسبة الرطوبة");
        strings161.add("التيارات الهوائية الصاعدة");
        strings161.add("كل ما ذكر");
        question161.setAnswer_list(strings161);

        Qustion question162 = new Qustion();
        question162.setName("ما حركة الهواء في المنطقة الاستوائية ؟");
        question162.setCorrect_answer("افقية");
        ArrayList<String> strings162 = new ArrayList<>();
        strings162.add("افقية");
        strings162.add("تصاعدية");
        strings162.add("سريعة");
        strings162.add("عاصفة");
        question162.setAnswer_list(strings162);

        Qustion question163 = new Qustion();
        question163.setName("ما نوع الرياح التي تهب على المناطق الاستوائية ؟");
        question163.setCorrect_answer("تجارية");
        ArrayList<String> strings163 = new ArrayList<>();
        strings163.add("غربية عكسية");
        strings163.add("قطبية");
        strings163.add("موسمية");
        strings163.add("تجارية");
        question163.setAnswer_list(strings163);

        Qustion question164 = new Qustion();
        question164.setName("بماذا يمتاز المدى الحراري اليومي و السنوي للإقليم الاستوائي ؟");
        question164.setCorrect_answer("منخفض");
        ArrayList<String> strings164 = new ArrayList<>();
        strings164.add("منخفض");
        strings164.add("مرتفع");
        strings164.add("متوسط");
        strings164.add("معتدل");
        question164.setAnswer_list(strings164);

        questions.clear();
        questions.add(question143);
        questions.add(question144);
        questions.add(question144);
        questions.add(question144);
        questions.add(question145);
        questions.add(question146);
        questions.add(question147);
        questions.add(question148);
        questions.add(question149);
        questions.add(question150);
        questions.add(question151);
        questions.add(question152);
        questions.add(question153);
        questions.add(question154);
        questions.add(question155);
        questions.add(question156);
        questions.add(question157);
        questions.add(question158);
        questions.add(question159);
        questions.add(question160);
        questions.add(question161);
        questions.add(question162);
        questions.add(question163);
        questions.add(question164);

        setData(0);
        updateScore(0);

    }

    private void Question_4() {

        Qustion question165 = new Qustion();
        question165.setName("ما لامتداد الفلكي لإقليم البحر المتوسط الى الشمال و الجنوب من خط الاستواء ؟");
        question165.setCorrect_answer("( 30 – 45 )");
        ArrayList<String> strings165 = new ArrayList<>();
        strings165.add("( 18 – 30 )");
        strings165.add("( 30 – 45 )");
        strings165.add("( 45 – 60 )");
        strings165.add("( 45 – 90 )");
        question165.setAnswer_list(strings165);

        Qustion question166 = new Qustion();
        question166.setName("ما الاقليم المناخي الذي يمتد بين دائرتي عرض ( 30 – 45 ) شمال و جنوب خط الاستواء ؟");
        question166.setCorrect_answer("البحر المتوسط");
        ArrayList<String> strings166 = new ArrayList<>();
        strings166.add("البحر المتوسط");
        strings166.add("الاقليم الموسمي");
        strings166.add("المعتدل البحري");
        strings166.add("الاقليم المداري");
        question166.setAnswer_list(strings166);

        Qustion question167 = new Qustion();
        question167.setName("اين يتركز اقليم مناخ البحر المتوسط ؟");
        question167.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings167 = new ArrayList<>();
        strings167.add("حوض البحر المتوسط");
        strings167.add("سواحل غرب اسيا");
        strings167.add("شمال غرب افريقيا");
        strings167.add("كل ما ذكر");
        question167.setAnswer_list(strings167);

        Qustion question168 = new Qustion();
        question168.setName("اين يتمثل اقليم البحر المتوسط في قارة امريكا الجنوبية؟");
        question168.setCorrect_answer("وسط تشيلي");
        ArrayList<String> strings168 = new ArrayList<>();
        strings168.add("اقصى شمال تشيلي");
        strings168.add("اقصى جنوب تشيلي");
        strings168.add("وسط تشيلي");
        strings168.add("شمال شرق تشيلي");
        question168.setAnswer_list(strings168);

        Qustion question169 = new Qustion();
        question169.setName("اين يوجد اقليم الكاب ؟");
        question169.setCorrect_answer("جنوب غرب افريقيا");
        ArrayList<String> strings169 = new ArrayList<>();
        strings169.add("شمال غرب افريقيا");
        strings169.add("شمال شرق افريقيا");
        strings169.add("جنوب غرب افريقيا");
        strings169.add("جنوب شرق افريقيا");
        question169.setAnswer_list(strings169);

        Qustion question170 = new Qustion();
        question170.setName("ضمن أي اقليم مناخي يقع اقليم الكاب في جنوب غرب افريقيا ؟");
        question170.setCorrect_answer("لاستوائي");
        ArrayList<String> strings170 = new ArrayList<>();
        strings170.add("لاستوائي");
        strings170.add("المداري");
        strings170.add("الصحراوي");
        strings170.add("البحر المتوسط");
        question170.setAnswer_list(strings170);

        Qustion question171 = new Qustion();
        question171.setName("ما المنطقة التي يتمثل فيها اقليم البحر المتوسط في قارة امريكا الشمالية ؟");
        question171.setCorrect_answer("كاليفورنيا");
        ArrayList<String> strings171 = new ArrayList<>();
        strings171.add("كاليفورنيا");
        strings171.add("فلوريدا");
        strings171.add("اريزونا");
        strings171.add("خليج المكسيك");
        question171.setAnswer_list(strings171);

        Qustion question172 = new Qustion();
        question172.setName("ما المناطق التي يظهر فيها اقليم مناخ البحر المتوسط ؟");
        question172.setCorrect_answer("جنوب غرب استراليا");
        ArrayList<String> strings172 = new ArrayList<>();
        strings172.add("السودان");
        strings172.add("ماليزيا");
        strings172.add("اثيوبيا");
        strings172.add("جنوب غرب استراليا");
        question172.setAnswer_list(strings172);

        Qustion question173 = new Qustion();
        question173.setName("ما الاقليم المناخي الذي يتميز بانه :حار جاف صيفا ، معتدل ماطر شتاءً ؟");
        question173.setCorrect_answer("البحر المتوسط");
        ArrayList<String> strings173 = new ArrayList<>();
        strings173.add("البحر المتوسط");
        strings173.add("الاستوائي");
        strings173.add("المداري");
        strings173.add("المعتدل الدافئ");
        question173.setAnswer_list(strings173);

        Qustion question174 = new Qustion();
        question174.setName("بماذا تتصف امطار اقليم البحر المتوسط ؟");
        question174.setCorrect_answer("متذبذبة");
        ArrayList<String> strings174 = new ArrayList<>();
        strings174.add("غزيرة");
        strings174.add("دائمة");
        strings174.add("قليلة");
        strings174.add("متذبذبة");
        question174.setAnswer_list(strings174);

        Qustion question175 = new Qustion();
        question175.setName("ما تصنيف الامطار في اقليم البحر المتوسط حسب الكمية الساقطة ؟");
        question175.setCorrect_answer("متوسطة");
        ArrayList<String> strings175 = new ArrayList<>();
        strings175.add("غزيرة");
        strings175.add("دائمة");
        strings175.add("متوسطة");
        strings175.add("قليلة");
        question175.setAnswer_list(strings175);

        Qustion question176 = new Qustion();
        question176.setName("كم تتراوح كمية الامطار في اقليم مناخ البحر المتوسط ؟");
        question176.setCorrect_answer("400 – 600ملم/سنويا");
        ArrayList<String> strings176 = new ArrayList<>();
        strings176.add("اقل من 300ملم/سنويا");
        strings176.add("400 – 600ملم/سنويا");
        strings176.add("1500ملم/سنويا");
        strings176.add("اكثر من 1500ملم/سنويا");
        question176.setAnswer_list(strings176);

        Qustion question177 = new Qustion();
        question177.setName("ما الاقليم المناخي الذي تتراوح كمية امطاره ( 400 – 600 ملم / سنويا ) ؟");
        question177.setCorrect_answer("البحر المتوسط");
        ArrayList<String> strings177 = new ArrayList<>();
        strings177.add("البحر المتوسط");
        strings177.add("الاستوائي");
        strings177.add("المداري");
        strings177.add("الموسمي");
        question177.setAnswer_list(strings177);

        Qustion question178 = new Qustion();
        question178.setName("ي الرياح المسؤولة عن تساقط الامطار على اقليم مناخ البحر المتوسط شتاءً ؟");
        question178.setCorrect_answer("الجنوبية الغربية");
        ArrayList<String> strings178 = new ArrayList<>();
        strings178.add("الشمالية الشرقية");
        strings178.add("الشمالية الغربية");
        strings178.add("الجنوبية الغربية");
        strings178.add("الجنوبية الشرقية");
        question178.setAnswer_list(strings178);

        Qustion question179 = new Qustion();
        question179.setName("ما الضغط الجوي الذي يقع اقليم مناخ البحر المتوسط صيفاً تحت تأثيره ؟");
        question179.setCorrect_answer("المرتفع شبه المداري");
        ArrayList<String> strings179 = new ArrayList<>();
        strings179.add("المرتفع القطبي");
        strings179.add("المنخفض شبه القطبي");
        strings179.add("المرتفع شبه المداري");
        strings179.add("المنخفض الاستوائي");
        question179.setAnswer_list(strings179);

        Qustion question180 = new Qustion();
        question180.setName("ما النتيجة المترتبة على سيطرة الضغط الجوي المرتفع شبه المداري (الأزوري) على اقليم البحر المتوسط ؟");
        question180.setCorrect_answer("جفافه صيفا");
        ArrayList<String> strings180 = new ArrayList<>();
        strings180.add("جفافه صيفا");
        strings180.add("اعتداله صيفا");
        strings180.add("تطرف مناخه صيفا");
        strings180.add("انخفاض حرارته صيفا");
        question180.setAnswer_list(strings180);

        Qustion question181 = new Qustion();
        question181.setName("ما الرياح المحلية الباردة التي تؤثر على اقليم مناخ البحر المتوسط ؟");
        question181.setCorrect_answer("رياح المسترال");
        ArrayList<String> strings181 = new ArrayList<>();
        strings181.add("رياح المسترال");
        strings181.add("رياح السيروكو");
        strings181.add(" رياح السولانو");
        strings181.add("رياح الخماسين");
        question181.setAnswer_list(strings181);

        Qustion question182 = new Qustion();
        question182.setName("ما الرياح المحلية الحارة التي تأتي من الصحراء الكبرى و تأثر على اقليم مناخ البحر المتوسط ؟");
        question182.setCorrect_answer("رياح الخماسين");
        ArrayList<String> strings182 = new ArrayList<>();
        strings182.add("رياح السموم");
        strings182.add("رياح الطوز");
        strings182.add("رياح الخماسين");
        strings182.add("رياح الهرمتان");
        question182.setAnswer_list(strings182);

        Qustion question183 = new Qustion();
        question183.setName("الى أي الاقاليم المناخية تنتمي فلسطين ؟");
        question183.setCorrect_answer("البحر المتوسط");
        ArrayList<String> strings183 = new ArrayList<>();
        strings183.add("الصحراوي");
        strings183.add("البحر المتوسط");
        strings183.add("المداري");
        strings183.add("الموسمي");
        question183.setAnswer_list(strings183);

        Qustion question184 = new Qustion();
        question184.setName("كم تتراوح كمية الامطار الساقطة على فلسطين سنويا ؟");
        question184.setCorrect_answer("400 – 600ملم/سنويا");
        ArrayList<String> strings184 = new ArrayList<>();
        strings184.add("200 – 400 ملم/سنويا");
        strings184.add("400 – 600ملم/سنويا");
        strings184.add("600 – 800ملم/سنويا");
        strings184.add("اكثر من 1500ملم/سنويا");
        question184.setAnswer_list(strings184);

        Qustion question185 = new Qustion();
        question185.setName(" لماذا لا تسقط الامطار على فلسطين صيفاً ؟");
        question185.setCorrect_answer("لتأثير المرتفع الأزوري");
        ArrayList<String> strings185 = new ArrayList<>();
        strings185.add("لتأثير المرتفع القطبي");
        strings185.add(" لتأثير المنخفض الاستوائي");
        strings185.add(" لتأثير المنخفض شبه القطبي");
        strings185.add("لتأثير المرتفع الأزوري");
        question185.setAnswer_list(strings185);

        Qustion question186 = new Qustion();
        question186.setName("ما سبب اعتدال حرارة مناخ السهل الساحلي الفلسطيني صيفاً و شتاءً ؟");
        question186.setCorrect_answer("مؤثرات البحر المتوسط");
        ArrayList<String> strings186 = new ArrayList<>();
        strings186.add("المرتفعات الجبلية");
        strings186.add("الاغوار");
        strings186.add("مؤثرات البحر المتوسط");
        strings186.add("هضبة النقب");
        question186.setAnswer_list(strings186);

        Qustion question187 = new Qustion();
        question187.setName("لماذا تزداد كمية الامطار الساقطة على السفوح الغربية لجبال فلسطين اكثر من السفوح الشرقية ؟");
        question187.setCorrect_answer("لمواجهتها للرياح الرطبة");
        ArrayList<String> strings187 = new ArrayList<>();
        strings187.add("لمواجهتها للرياح الرطبة");
        strings187.add("لوقوعها في ظل المطر");
        strings187.add("لأنها موازية للساحل");
        strings187.add("لعدم تعامدها مع خط الساحل");
        question187.setAnswer_list(strings187);

        Qustion question188 = new Qustion();
        question188.setName("بماذا تمتاز امطار الاجزاء الجنوبية من الاغوار الفلسطينية ؟");
        question188.setCorrect_answer("قليلة");
        ArrayList<String> strings188 = new ArrayList<>();
        strings188.add("قليلة");
        strings188.add("نادرة");
        strings188.add("متوسطة");
        strings188.add("غزيرة");
        question188.setAnswer_list(strings188);

        Qustion question189 = new Qustion();
        question189.setName("لماذا تزداد كمية الامطار في الجزء الشمالي من الاغوار الفلسطينية ؟");
        question189.setCorrect_answer("لمرورها من سهلي مرج بن عامر و البطوف");
        ArrayList<String> strings189 = new ArrayList<>();
        strings189.add("لمرورها من سهلي مرج بن عامر و البطوف");
        strings189.add("السهل الساحلي");
        strings189.add("وادي عربة");
        strings189.add("جبال الجليل");
        question189.setAnswer_list(strings189);

        questions.clear();
        questions.add(question165);
        questions.add(question166);
        questions.add(question167);
        questions.add(question168);
        questions.add(question169);
        questions.add(question170);
        questions.add(question171);
        questions.add(question172);
        questions.add(question173);
        questions.add(question174);
        questions.add(question175);
        questions.add(question176);
        questions.add(question177);
        questions.add(question178);
        questions.add(question179);
        questions.add(question180);
        questions.add(question181);
        questions.add(question182);
        questions.add(question183);
        questions.add(question184);
        questions.add(question185);
        questions.add(question186);
        questions.add(question187);
        questions.add(question188);
        questions.add(question189);

        updateScore(0);
        setData(0);

    }

    private void Question_5() {

        Qustion question190 = new Qustion();
        question190.setName("كم تشكل مساحة هضبة النقب من مساحة فلسطين ؟");
        question190.setCorrect_answer("النصف");
        ArrayList<String> strings190 = new ArrayList<>();
        strings190.add("النصف");
        strings190.add("الثلث");
        strings190.add("الربع");
        strings190.add("الخمس");
        question190.setAnswer_list(strings190);

        Qustion question191 = new Qustion();
        question191.setName("ما الاقاليم المناخية التي تمتد بين دائرتي عرض ( 60 – 90 ) شمال و جنوب خط الاستواء ؟");
        question191.setCorrect_answer("الباردة");
        ArrayList<String> strings191 = new ArrayList<>();
        strings191.add("الباردة");
        strings191.add("المعتدلة");
        strings191.add("الحارة");
        strings191.add("المتطرفة");
        question191.setAnswer_list(strings191);

        Qustion question192 = new Qustion();
        question192.setName("في أي جزيرة من جزر قارة امريكيا الشمالية تظهر الاقاليم المناخية الباردة ؟ ");
        question192.setCorrect_answer("جرينلاند");
        ArrayList<String> strings192 = new ArrayList<>();
        strings192.add("سيبيريا");
        strings192.add("مدغشقر");
        strings192.add("نيوزيلندا");
        strings192.add("جرينلاند");
        question192.setAnswer_list(strings192);

        Qustion question193 = new Qustion();
        question193.setName("أي الاقاليم المناخية الاتية تظهر في القارة القطبية الجنوبية ؟");
        question193.setCorrect_answer("الباردة");
        ArrayList<String> strings193 = new ArrayList<>();
        strings193.add("الباردة");
        strings193.add("الحارة");
        strings193.add("المعتدلة");
        strings193.add("المتطرفة");
        question193.setAnswer_list(strings193);

        Qustion question194 = new Qustion();
        question194.setName("ما الاقليم المناخي الذي تتركز معظم امطاره في نصف السنة الصيفي ؟");
        question194.setCorrect_answer("المناخ شبه القطبي");
        ArrayList<String> strings194 = new ArrayList<>();
        strings194.add("المناخ القطبي");
        strings194.add("مناخ التندرا");
        strings194.add("البحر المتوسط");
        strings194.add("المناخ شبه القطبي");
        question194.setAnswer_list(strings194);

        Qustion question195 = new Qustion();
        question195.setName("ما الاقليم المناخي الذي يمتد في كل من وسط سيبيريا و شمال كندا و شمال اوروبا و الاسكا ؟");
        question195.setCorrect_answer("شبه القطبي");
        ArrayList<String> strings195 = new ArrayList<>();
        strings195.add("المعتدل الدافئ");
        strings195.add("شبه القطبي");
        strings195.add("التندرا");
        strings195.add("القطبي");
        question195.setAnswer_list(strings195);

        Qustion question196 = new Qustion();
        question196.setName("كم يبلغ معدل الحرارة السنوي في الاقاليم المناخية الباردة ؟");
        question196.setCorrect_answer("لا يزيد عن صفر درجة مئوية");
        ArrayList<String> strings196 = new ArrayList<>();
        strings196.add("18درجة مئوية");
        strings196.add("15درجة مئوية");
        strings196.add("5درجة مئوية");
        strings196.add("لا يزيد عن صفر درجة مئوية");
        question196.setAnswer_list(strings196);

        Qustion question197 = new Qustion();
        question197.setName("ما المنطقة التي لا يظهر فيها مناخ التندرا ؟");
        question197.setCorrect_answer("خليج المكسيك");
        ArrayList<String> strings197 = new ArrayList<>();
        strings197.add("خليج هدسن");
        strings197.add("خليج المكسيك");
        strings197.add("شمال ايسلندا");
        strings197.add("سواحل جرينلاند");
        question197.setAnswer_list(strings197);

        Qustion question198 = new Qustion();
        question198.setName("ما الاقليم المناخي الذي يخلو من مظاهر الحياة و يوصف بالصحاري الجليدية ؟");
        question198.setCorrect_answer("القطبي");
        ArrayList<String> strings198 = new ArrayList<>();
        strings198.add("شبه القطبي");
        strings198.add(" التندرا");
        strings198.add("القطبي");
        strings198.add("المداري");
        question198.setAnswer_list(strings198);

        Qustion question199 = new Qustion();
        question199.setName("اين تنخفض كثافة السكان بشكل كبير و تكاد تخلو من السكان بسبب تأثير المناخ البارد ؟");
        question199.setCorrect_answer("شمال القارات");
        ArrayList<String> strings199 = new ArrayList<>();
        strings199.add("شرق القارات");
        strings199.add("غرب القارات");
        strings199.add("شمال القارات");
        strings199.add("وسط القارات");
        question199.setAnswer_list(strings199);

        Qustion question200 = new Qustion();
        question200.setName("كم يبلغ الضغط الجوي اذا انخفضنا عن مستوى سطح البحر 30 متر؟");
        question200.setCorrect_answer("1016 مليبار");
        ArrayList<String> strings200 = new ArrayList<>();
        strings200.add("1015 مليبار");
        strings200.add("1016 مليبار");
        strings200.add("1010 مليبار");
        strings200.add("1017 مليبار");
        question200.setAnswer_list(strings200);

        Qustion question201 = new Qustion();
        question201.setName("ما منطقة انتقال الرياح التجارية الجنوبية الشرقية و الرياح الشمالية الشرقية ؟");
        question201.setCorrect_answer("منطقة الركود الاستوائي");
        ArrayList<String> strings201 = new ArrayList<>();
        strings201.add("منطقة الركود الاستوائي");
        strings201.add("المنطقة المدارية");
        strings201.add("المنطقة المعتدلة");
        strings201.add("المنطقة القطبية");
        question201.setAnswer_list(strings201);

        Qustion question202 = new Qustion();
        question202.setName("ما المنطقة ذات الضغط الجوي المنخفض و تتميز بهدوء هوائها لفترة طويلة على جانبي خط الاستواء ؟");
        question202.setCorrect_answer("منطقة الركود الاستوائي");
        ArrayList<String> strings202 = new ArrayList<>();
        strings202.add("المنطقة المدارية");
        strings202.add("المنطقة القطبية");
        strings202.add("منطقة الركود الاستوائي");
        strings202.add("المنطقة المعتدلة");
        question202.setAnswer_list(strings202);

        Qustion question203 = new Qustion();
        question203.setName("بماذا يمتاز المدى الحراري اليومي , و السنوي للإقليم الاستوائي ؟");
        question203.setCorrect_answer("منخفض");
        ArrayList<String> strings203 = new ArrayList<>();
        strings203.add("منخفض");
        strings203.add("مرتفع");
        strings203.add("متوسط");
        strings203.add("معتدل");
        question203.setAnswer_list(strings203);

        Qustion question204 = new Qustion();
        question204.setName("ما النتيجة المترتبة عن الامتداد الطولي لجبال فلسطين ؟");
        question204.setCorrect_answer("انخفاض كمية امطار شرق فلسطين");
        ArrayList<String> strings204 = new ArrayList<>();
        strings204.add("انخفاض معدل درجات الحرارة شرق فلسطين");
        strings204.add("انخفاض كمية امطار شرق فلسطين");
        strings204.add("الحد من تأثير هبوب رياح الخماسين على شرق فلسطين");
        strings204.add("شدة سرعة الرياح الغربية على شرق فلسطين");
        question204.setAnswer_list(strings204);

        Qustion question205 = new Qustion();
        question205.setName("في أي جزء من قارات : اسيا , و اوروبا , و امريكا الشمالية توجد الاقاليم المناخية الباردة ؟");
        question205.setCorrect_answer("شمالها");
        ArrayList<String> strings205 = new ArrayList<>();
        strings205.add("وسطها");
        strings205.add("جنوبها");
        strings205.add("شمالها");
        strings205.add("غربها");
        question205.setAnswer_list(strings205);


        questions.clear();
        questions.add(question190);
        questions.add(question191);
        questions.add(question192);
        questions.add(question193);
        questions.add(question194);
        questions.add(question195);
        questions.add(question196);
        questions.add(question197);
        questions.add(question198);
        questions.add(question199);
        questions.add(question200);
        questions.add(question201);
        questions.add(question202);
        questions.add(question203);
        questions.add(question204);
        questions.add(question205);
        setData(0);
        updateScore(0);

    }
//الوحدة التانية
    private void Question_6() {
        Qustion question1 = new Qustion();
        question1.setName("ما العناصر الموجودة في الطبيعة و لا علاقة للإنسان بوجودها سواء كانت في باطن الارض ام على سطحها ؟");
        question1.setCorrect_answer("الموارد الطبيعية");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("الموارد البشرية");
        strings.add("الموارد الطبيعية");
        strings.add("الموارد الاقتصادية");
        strings.add("الموارد البيئية");
        question1.setAnswer_list(strings);


        Qustion question2 = new Qustion();
        question2.setName("لماذا تعد الموارد الطبيعية ذات اهمية كبيرة في حياة الانسان ؟");
        question2.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("تلبي حاجاته وتطور حضارته");
        strings2.add("ترفع من مستوى رفاهيته");
        strings2.add("تزيد من مستوى دخله");
        strings2.add("كل ما ذكر");
        question2.setAnswer_list(strings2);


        Qustion question3 = new Qustion();
        question3.setName(" ما المورد الطبيعي الاساسي في منطقة الخليج العربي ؟");
        question3.setCorrect_answer("النفط");
        ArrayList<String> strings3 = new ArrayList<>();
        strings3.add("الفحم الحجري");
        strings3.add("النفط");
        strings3.add("الاملاح");
        strings3.add("الصخور");
        question3.setAnswer_list(strings3);


        Qustion question4 = new Qustion();
        question4.setName("ما الموارد الطبيعية التي لها اهمية اقتصادية كبيرة في فلسطين ؟");
        question4.setCorrect_answer("الصخور");
        ArrayList<String> strings4 = new ArrayList<>();
        strings4.add("الاخشاب");
        strings4.add("النفط");
        strings4.add("الصخور");
        strings4.add("الفحم الحجري");
        question4.setAnswer_list(strings4);

        Qustion question5 = new Qustion();
        question5.setName("ما الاثار السلبية و المدمرة للموارد الطبيعية ؟");
        question5.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings5 = new ArrayList<>();
        strings5.add("تعرض الدول للأطماع الخارجية");
        strings5.add("تقيدها باتفاقيات سياسية وعسكرية");
        strings5.add("تحدث خلل في التوازن البيئي");
        strings5.add("كل ما ذكر");
        question5.setAnswer_list(strings5);

        Qustion question6 = new Qustion();
        question6.setName("ضمن أي تصنيف تدخل المصادر العضوية للموارد الطبيعية ؟");
        question6.setCorrect_answer("التركيبي");
        ArrayList<String> strings6 = new ArrayList<>();
        strings6.add("الإنتاجي");
        strings6.add("التركيبي");
        strings6.add("المكاني");
        strings6.add("الطبيعي");
        question6.setAnswer_list(strings6);


        Qustion question7 = new Qustion();
        question7.setName("ضمن أي من المجموعات الاتية يمكن ان تصنف الغابات ؟");
        question7.setCorrect_answer("متوسطة الانتشار");
        ArrayList<String> strings7 = new ArrayList<>();
        strings7.add("واسعة الانتشار");
        strings7.add("متوسطة الانتشار");
        strings7.add("محدودة الانتشار");
        strings7.add("نادرة الانتشار");
        question7.setAnswer_list(strings7);


        Qustion question8 = new Qustion();
        question8.setName("ضمن أي تصنيف تدخل المصادر الغير عضوية للموارد الطبيعية ؟");
        question8.setCorrect_answer("التركيبي");
        ArrayList<String> strings8 = new ArrayList<>();
        strings8.add("التركيبي");
        strings8.add("المكاني");
        strings8.add("الإنتاجي");
        strings8.add("الطبيعي");
        question8.setAnswer_list(strings8);


        Qustion question9 = new Qustion();
        question9.setName("ضمن أي المجموعات الاتية يمكن تصنيف الهواء و الاشعة الشمسية و التربة و المياه ؟");
        question9.setCorrect_answer("واسعة الانتشار");
        ArrayList<String> strings9 = new ArrayList<>();
        strings9.add("متوسطة الانتشار");
        strings9.add("محدودة الانتشار");
        strings9.add("واسعة الانتشار");
        strings9.add("نادرة الانتشار");
        question9.setAnswer_list(strings9);


        Qustion question10 = new Qustion();
        question10.setName("ضمن أي المجموعات الاتية يمكن تصنيف الذهب والماس و النيكل ؟");
        question10.setCorrect_answer("كثيرة الانتشار");
        ArrayList<String> strings10 = new ArrayList<>();
        strings10.add("كثيرة الانتشار");
        strings10.add("واسعة الانتشار");
        strings10.add("متوسطة الانتشار");
        strings10.add("محدودة الانتشار");
        question10.setAnswer_list(strings10);

        Qustion question11 = new Qustion();
        question11.setName("ضمن أي تصنيف تدخل الموارد الطبيعية الاتية ( الطاقة الشمسية ، الرياح ، و المد و الجزر ) ؟");
        question11.setCorrect_answer("الإنتاجي");
        ArrayList<String> strings11 = new ArrayList<>();
        strings11.add("الإنتاجي");
        strings11.add("التركيبي");
        strings11.add("المكاني");
        strings11.add("العضوي");
        question11.setAnswer_list(strings11);

        Qustion question12 = new Qustion();
        question12.setName("ضمن أي الموارد يمكن تصنيف الغابات و ينابيع المياه ؟");
        question12.setCorrect_answer("موارد متجددة");
        ArrayList<String> strings12 = new ArrayList<>();
        strings12.add("موارد دائمة لا تنفذ");
        strings12.add("موارد متجددة");
        strings12.add("موارد غير متجددة");
        strings12.add("موارد محدودة");
        question12.setAnswer_list(strings12);


        Qustion question13 = new Qustion();
        question13.setName("ضمن أي الموارد يمكن تصنيف النفط و الغاز الطبيعي ؟");
        question13.setCorrect_answer("موارد غير متجددة");
        ArrayList<String> strings13 = new ArrayList<>();
        strings13.add("موارد متجددة");
        strings13.add("موارد لا تنفذ");
        strings13.add("موارد غير متجددة");
        strings13.add("موارد قليلة");
        question13.setAnswer_list(strings13);


        Qustion question14 = new Qustion();
        question14.setName("في أي البيئات تزداد تكلفة استغلال الموارد الطبيعية ؟");
        question14.setCorrect_answer("القطبية الباردة");
        ArrayList<String> strings14 = new ArrayList<>();
        strings14.add("القطبية الباردة");
        strings14.add("المعتدلة");
        strings14.add("المدارية");
        strings14.add("الاستوائية");
        question14.setAnswer_list(strings14);
///
        Qustion question15 = new Qustion();
        question15.setName("كيف يسهم التقدم العلمي و التكنولوجي في تخفيف الاستغلال المفرط لكثير من الموارد الطبيعية ؟");
        question15.setCorrect_answer("ايجاد بدائل لها من الموارد الصناعية");
        ArrayList<String> strings15 = new ArrayList<>();
        strings15.add("زيادة اسعارها");
        strings15.add("ايجاد بدائل لها من الموارد الصناعية");
        strings15.add("تقليل اسعارها");
        strings15.add("تثبيت الاسعار");
        question15.setAnswer_list(strings15);

        Qustion question16 = new Qustion();
        question16.setName("ماذا يترتب على امتلاك الدولة للموارد الطبيعية , و استغلالها بشكل امثل ؟");
        question16.setCorrect_answer("تصبح دولة ذات تأثير في القرارات الاقتصادية و السياسية");
        ArrayList<String> strings16 = new ArrayList<>();
        strings16.add("تصبح دولة ذات تأثير في القرارات الاقتصادية و السياسية");
        strings16.add("تصبح دولة مستهلكة");
        strings16.add("تصبح دولة خاضعة لاحتلال عسكري");
        strings16.add("تستغني عن علاقاتها الاقتصادية مع الدول الاخرى");
        question16.setAnswer_list(strings16);


        Qustion question17 = new Qustion();
        question17.setName("ما التصنيف الذي يعتمد على مدى وفرة الموارد الطبيعية و انتشارها مكانيا ؟");
        question17.setCorrect_answer("التصنيف المكاني");
        ArrayList<String> strings17 = new ArrayList<>();
        strings17.add("التصنيف التركيبي");
        strings17.add("التصنيف المكاني");
        strings17.add("التصنيف الانتاجي");
        strings17.add("التصنيف التركيبي و الانتاجي");
        question17.setAnswer_list(strings17);


        Qustion question18 = new Qustion();
        question18.setName("ما التصنيف الذي يهتم بدراسة الموارد الطبيعية حسب العوامل التي ادت الى تركيبها ؟");
        question18.setCorrect_answer("التصنيف التركيبي");
        ArrayList<String> strings18 = new ArrayList<>();
        strings18.add("التصنيف الانتاجي");
        strings18.add("التصنيف التركيبي");
        strings18.add("التصنيف المكاني و الانتاجي");
        strings18.add("التصنيف المكاني");
        question18.setAnswer_list(strings18);


        Qustion question19 = new Qustion();
        question19.setName("ضمن أي الموارد يمكن تصنيف الطاقة الشمسية و الرياح و المد و الجزر ؟");
        question19.setCorrect_answer("الموارد الدائمة");
        ArrayList<String> strings19 = new ArrayList<>();
        strings19.add("الموارد الدائمة");
        strings19.add("الموارد المتجددة");
        strings19.add("الموارد الغير متجددة");
        strings19.add("الموارد نادرة الانتشار");
        question19.setAnswer_list(strings19);


        questions.clear();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        questions.add(question11);
        questions.add(question12);
        questions.add(question13);
        questions.add(question14);
        questions.add(question15);
        questions.add(question16);
        questions.add(question17);
        questions.add(question18);
        questions.add(question19);
        setData(0);
        updateScore(0);

    }

    private void Question_7() {
        Qustion question20 = new Qustion();
        question20.setName("ما المفهوم الذي يحتوي على معدن او مجموعة من المعادن بكميات تكفي لاستغلالها اقتصاديا تحت ظروف معينة");
        question20.setCorrect_answer("الرواسب المعدنية");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("الموارد المعدنية");
        strings20.add("الرواسب المعدنية");
        strings20.add("الموارد النباتية");
        strings20.add("الموارد الطبيعية");
        question20.setAnswer_list(strings20);
//
        Qustion question21 = new Qustion();
        question21.setName("ما العوامل التي تساعد في توزيع الموارد المعدنية ؟");
        question21.setCorrect_answer("ب + ج");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("الانسان");
        strings21.add("نوع الصخور");
        strings21.add("عوامل التعرية");
        strings21.add("ب + ج");
        question21.setAnswer_list(strings21);
//
        Qustion question22 = new Qustion();
        question22.setName("ما الصخور التي تكونت من مادة الماغما التي تخرج من باطن الارض عند ثوران البراكين ؟");
        question22.setCorrect_answer("الصخور النارية");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("الصخور النارية");
        strings22.add("الصخور الرسوبية");
        strings22.add("الصخور المتحولة");
        strings22.add("الصوان");
        question22.setAnswer_list(strings22);
//
        Qustion question23 = new Qustion();
        question23.setName("اي من الخصائص الاتية لا تعتبر من خصائص الصخور النارية ؟");
        question23.setCorrect_answer("تظهر على شكل طبقات");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("تظهر على شكل كتل");
        strings23.add("غير مسامية");
        strings23.add("تخلو من الاحافير");
        strings23.add("تظهر على شكل طبقات");
        question23.setAnswer_list(strings23);
//
        Qustion question24 = new Qustion();
        question24.setName("ي الصخور الاتية تعتبر من الصخور النارية ؟");
        question24.setCorrect_answer("الجرانيت و البازلت");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("الجير و الصوان");
        strings24.add("الشيست و النايس");
        strings24.add("الجرانيت و البازلت");
        strings24.add("عروق الكوارتز و الرخام");
        question24.setAnswer_list(strings24);
//
        Qustion question25 = new Qustion();
        question25.setName("ما الصخور التي تحتوي على المعادن التالية ( الذهب ، الماس ، الفضة ) ؟");
        question25.setCorrect_answer("الصخور النارية");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("الصخور النارية");
        strings25.add("الصخور الرسوبية");
        strings25.add("الصخور المتحولة");
        strings25.add("كل ما ذكر");
        question25.setAnswer_list(strings25);
//
        Qustion question26 = new Qustion();
        question26.setName("ما الصخور التي تنتج عندما تبرد مادة الماغما و تتصلب على سطح الارض ؟");
        question26.setCorrect_answer("البركانية السطحية");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("البركانية السطحية");
        strings26.add("الجوفية");
        strings26.add("الصوان");
        strings26.add("الاحافير");
        question26.setAnswer_list(strings26);
//
        Qustion question27 = new Qustion();
        question27.setName("ما الصخور التي تكونت بفعل تراكم الرواسب و المفتتات الصخرية في قيعان البحار و المحيطات عبر ملايين السنين ؟");
        question27.setCorrect_answer("الصخور الرسوبية");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("الصخور النارية");
        strings27.add("الصخور المتحولة");
        strings27.add("الصخور الرسوبية");
        strings27.add("الرخام");
        question27.setAnswer_list(strings27);
//
        Qustion question28 = new Qustion();
        question28.setName("ما الصخور التي تظهر على شكل طبقات و تكون صخور رملية او طينية او عضوية ؟");
        question28.setCorrect_answer("الصخور الرسوبية");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("الصخور النارية");
        strings28.add("الصخور الرسوبية");
        strings28.add("الصخور المتحولة");
        strings28.add("كل ما ذكر");
        question28.setAnswer_list(strings28);
//
        Qustion question29 = new Qustion();
        question29.setName("ما الصخور التي تمتاز بمساميتها و وجود خزانات المياه و النفط و الغاز ؟");
        question29.setCorrect_answer("الصخور الرسوبية");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("الصخور النارية");
        strings29.add("الصخور الرسوبية");
        strings29.add("الصخور المتحولة");
        strings29.add("البازلت");
        question29.setAnswer_list(strings29);
//
        Qustion question30 = new Qustion();
        question30.setName("ما الامثلة على الصخور الرسوبية ؟");
        question30.setCorrect_answer("الجير والصوان");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("البازلت والجرانيت");
        strings30.add("عروق الكوارتز");
        strings30.add("النايس والشيست");
        strings30.add("الجير والصوان");
        question30.setAnswer_list(strings30);
//
        Qustion question31 = new Qustion();
        question31.setName("ما الخامات التي تحتوي عليها الصخور الرسوبية ؟");
        question31.setCorrect_answer("النفط والغاز الطبيعي");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("الذهب والماس");
        strings31.add("الذهب والنحاس");
        strings31.add("الفضة والاحجار الكريمة");
        strings31.add("النفط والغاز الطبيعي");
        question31.setAnswer_list(strings31);
//
        Qustion question32 = new Qustion();
        question32.setName("ما الصخور التي تعود بأصلها الى الصخور النارية او الصخور الرسوبية ؟");
        question32.setCorrect_answer("الصخور المتحولة");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("الصخور النارية");
        strings32.add("الصخور الرسوبية");
        strings32.add("الصخور المتحولة");
        strings32.add("ليس مما ذكر");
        question32.setAnswer_list(strings32);
//
        Qustion question33 = new Qustion();
        question33.setName("ما الامثلة على الصخور المتحولة ؟");
        question33.setCorrect_answer("عروق الكوارتز والرخام");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("النايس والشيست");
        strings33.add("عروق الكوارتز والرخام");
        strings33.add("الحجر الجيري والصوان");
        strings33.add("أ + ب");
        question33.setAnswer_list(strings33);
//
        Qustion question34 = new Qustion();
        question34.setName("أي الصخور تحتوي على معدني الذهب و النحاس ؟");
        question34.setCorrect_answer("عروق الكوارتز و الرخام");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("النايس");
        strings34.add("الشيست");
        strings34.add("عروق الكوارتز و الرخام");
        strings34.add("البازلت");
        question34.setAnswer_list(strings34);
//
        Qustion question35 = new Qustion();
        question35.setName("ما التي تؤدي الى تفتيت الصخور و المعادن و نقلها من اماكن وجودها الى مناطق جديدة ؟");
        question35.setCorrect_answer("عوامل التعرية");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("عوامل التعرية");
        strings35.add("التجوية");
        strings35.add("البراكين");
        strings35.add("الزلازل");
        question35.setAnswer_list(strings35);
//
        Qustion question36 = new Qustion();
        question36.setName("ما العمليات التي تقوم بها عوامل التعرية في اعادة توزيع المعادن ؟");
        question36.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("النحت");
        strings36.add("النقل");
        strings36.add("الارساب");
        strings36.add("كل ما ذكر");
        question36.setAnswer_list(strings36);
//
        Qustion question37 = new Qustion();
        question37.setName("ما المعدن الذي يعود اصل تشكله الى تعرض النباتات و الاشجار التي اندثرت تحت الارض ؟");
        question37.setCorrect_answer("الفحم الحجري");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("الفحم الحجري");
        strings37.add("النفط");
        strings37.add("الغاز الطبيعي");
        strings37.add("الزنك");
        question37.setAnswer_list(strings37);
//
        Qustion question38 = new Qustion();
        question38.setName("ما المناطق التي يوجد فيها الفحم الحجري ؟");
        question38.setCorrect_answer("جميع ما ذكر");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("الصين");
        strings38.add("المانيا");
        strings38.add("جنوب افريقيا");
        strings38.add("جميع ما ذكر");
        question38.setAnswer_list(strings38);
//
        Qustion question39 = new Qustion();
        question39.setName("ما الامثلة على المواد الهيدروكربونية ؟");
        question39.setCorrect_answer("الغاز والنفط");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("الغاز والنفط");
        strings39.add("النحاس والفضة");
        strings39.add("الذهب والماس");
        strings39.add("الالمنيوم والحديد");
        question39.setAnswer_list(strings39);
//
        Qustion question40 = new Qustion();
        question40.setName("بماذا تشتهر كل من دول الخليج العربي و الجزائر و العراق و روسيا ؟");
        question40.setCorrect_answer("البترول والغاز");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("الذهب والفضة");
        strings40.add("الفحم الحجري");
        strings40.add("القصدير");
        strings40.add("البترول والغاز");
        question40.setAnswer_list(strings40);
//
        Qustion question41 = new Qustion();
        question41.setName("بماذا تتصف المعادن الفلزية عند استخلاصها ؟");
        question41.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("قابلة للطرق والسحب");
        strings41.add("لها بريق ولمعان");
        strings41.add("موصلة للحرارة والكهرباء");
        strings41.add("كل ما ذكر");
        question41.setAnswer_list(strings41);
//
        Qustion question42 = new Qustion();
        question42.setName("من أي الخامات الاتية يستخرج الحديد ؟");
        question42.setCorrect_answer("الخامات الحديدية");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("الخامات الحديدية");
        strings42.add("الفلزات الثمينة");
        strings42.add("الفلزات الغير حديدية");
        strings42.add("فلزات السبائك");
        question42.setAnswer_list(strings42);
//
        Qustion question43 = new Qustion();
        question43.setName("ضمن أي المعادن الفلزية يصنف النحاس و القصدير ؟");
        question43.setCorrect_answer("الفلزات غير الحديدي");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("الفلزات غير الحديدية");
        strings43.add("الخامات الحديدية");
        strings43.add("فلزات السبائك");
        strings43.add("الفلزات الثمينة");
        question43.setAnswer_list(strings43);
//
        Qustion question44 = new Qustion();
        question44.setName("ضمن أي المعادن الفلزية يصنف الصلب و المنغنيز و النيكل ؟");
        question44.setCorrect_answer("فلزات السبائك");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("الفلزات غير الحديدية");
        strings44.add("الخامات الحديدية");
        strings44.add("فلزات السبائك");
        strings44.add("الفلزات الثمينة");
        question44.setAnswer_list(strings44);
//
        Qustion question45 = new Qustion();
        question45.setName("ضمن أي المعادن الفلزية يصنف الذهب ؟");
        question45.setCorrect_answer("الفلزات الثمينة");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("الخامات الحديدية");
        strings45.add("الفلزات غير الحديدية");
        strings45.add("فلزات السبائك");
        strings45.add("الفلزات الثمينة");
        question45.setAnswer_list(strings45);
//
        Qustion question46 = new Qustion();
        question46.setName("على ماذا تشتمل الاملاح و المعادن اللافلزية ؟");
        question46.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("كبريتات الكالسيوم");
        strings46.add("الفوسفات");
        strings46.add("السليكات");
        strings46.add("كل ما ذكر");
        question46.setAnswer_list(strings46);
//
        Qustion question47 = new Qustion();
        question47.setName("ما الاسم العلمي للجبس ؟");
        question47.setCorrect_answer("كبريتات الكالسيوم");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("كبريتات الكربون");
        strings47.add("كبريتات البوتاسيوم");
        strings47.add("كبريتات الكالسيوم");
        strings47.add("الصوديوم");
        question47.setAnswer_list(strings47);
//
        Qustion question48 = new Qustion();
        question48.setName("من أي الخامات يستخرج خام الالمنيوم ؟");
        question48.setCorrect_answer("السليكات");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("الماجنيت");
        strings48.add("الهيماتايت");
        strings48.add("الهيدروكربونات");
        strings48.add("السليكات");
        question48.setAnswer_list(strings48);
//
        Qustion question49 = new Qustion();
        question49.setName("ما الخامات التي تحتويها بعض السليكات ؟");
        question49.setCorrect_answer("الالمنيوم");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("الالمنيوم");
        strings49.add("النحاس");
        strings49.add("الحديد");
        strings49.add("الذهب");
        question49.setAnswer_list(strings49);
//
        Qustion question50 = new Qustion();
        question50.setName("بماذا يرتبط وجود الموارد المعدنية ؟");
        question50.setCorrect_answer("طبيعة التركيب الجيولوجي");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("المستوى العلمي والتكنولوجي");
        strings50.add("طبيعة التركيب الجيولوجي");
        strings50.add("الظروف المناخية");
        strings50.add("الظروف الاقتصادية");
        question50.setAnswer_list(strings50);
//
        Qustion question51 = new Qustion();
        question51.setName("ما المعدنان العضويان اللذان يرتبط وجودهما بالصخور الرسوبية ؟");
        question51.setCorrect_answer("البترول والغاز الطبيعي");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("البترول والغاز الطبيعي");
        strings51.add("الرصاص والحديد");
        strings51.add("الذهب والنحاس");
        strings51.add("الماس والفضة");
        question51.setAnswer_list(strings51);
//
        Qustion question52 = new Qustion();
        question52.setName("ما اشهر دول العالم من حيث وجود النفط ؟");
        question52.setCorrect_answer("السعودية");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("الهند");
        strings52.add("تركيا");
        strings52.add("السعودية");
        strings52.add("المغرب");
        question52.setAnswer_list(strings52);
//
        Qustion question53 = new Qustion();
        question53.setName("ما المعادن التي تتركز في مياه البحر الميت بكميات كبيرة ؟");
        question53.setCorrect_answer("الاملاح المعدنية");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("الفوسفات");
        strings53.add("الحديد");
        strings53.add("النحاس");
        strings53.add("الاملاح المعدنية");
        question53.setAnswer_list(strings53);
//
        Qustion question54 = new Qustion();
        question54.setName("ما الاملاح المعدنية التي تتركز في البحر الميت بكميات كبيرة ؟");
        question54.setCorrect_answer("ب + ج");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("الفوسفات");
        strings54.add("البوتاسيوم");
        strings54.add("الصوديوم");
        strings54.add("ب + ج");
        question54.setAnswer_list(strings54);
//
        Qustion question55 = new Qustion();
        question55.setName("ما الخام الذي يتركز في منطقة اريحا و النبي موسى و بيت لحم و صحراء النقب ؟");
        question55.setCorrect_answer("الفوسفات");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("الحديد");
        strings55.add("الفوسفات");
        strings55.add("النحاس");
        strings55.add("المنجنيز");
        question55.setAnswer_list(strings55);
//
        Qustion question56 = new Qustion();
        question56.setName("ما المورد المعدني الذي يستخدم في صناعة الاسمدة الكيماوية ؟");
        question56.setCorrect_answer("الفوسفات");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("الاملاح المعدنية");
        strings56.add("المنجنيز");
        strings56.add("الفوسفات");
        strings56.add("النحاس");
        question56.setAnswer_list(strings56);
//
        Qustion question57 = new Qustion();
        question57.setName("ما الخام الذي توجد خاماته في قاع وادي الرمان في النقب و وادي الجرافي جنوب البحر الميت قرب وادي عربة؟");
        question57.setCorrect_answer("الحديد");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("الحديد");
        strings57.add("النحاس");
        strings57.add("الحجر الجيري");
        strings57.add("الصوديوم");
        question57.setAnswer_list(strings57);
//
        Qustion question58 = new Qustion();
        question58.setName("ما المناطق التي تتركز فيها صخور الحجر الجيري في فلسطين ؟");
        question58.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("قباطية في جنين");
        strings58.add("جماعين في نابلس");
        strings58.add("الشيوخ في الخليل");
        strings58.add("كل ما ذكر");
        question58.setAnswer_list(strings58);
//
        Qustion question59 = new Qustion();
        question59.setName("ما المورد الطبيعي الذي اكتشف مؤخرا قرب الساحل الفلسطيني بين عسقلان و غزة و مقابل سهل عكا و حيفا؟");
        question59.setCorrect_answer("الغاز الطبيعي");
        ArrayList<String> strings59 = new ArrayList<>();
        strings59.add("البترول");
        strings59.add("الغاز الطبيعي");
        strings59.add("الخث");
        strings59.add("الرمال القطرانية");
        question59.setAnswer_list(strings59);
//
        Qustion question60 = new Qustion();
        question60.setName("ما المورد الذي يوجد غرب البحر الميت و بحيرة طبريا و النقب و البحر المتوسط في فلسطين ؟");
        question60.setCorrect_answer("البترول");
        ArrayList<String> strings60 = new ArrayList<>();
        strings60.add("اليورانيوم");
        strings60.add("الصخور الزيتية");
        strings60.add("البترول");
        strings60.add("الخث");
        question60.setAnswer_list(strings60);
//
        Qustion question61 = new Qustion();
        question61.setName("ما المورد الذي اكتشف حديثا في اللطرون قرب القدس وغرب رام الله قرب رنتيس ؟");
        question61.setCorrect_answer("البترول");
        ArrayList<String> strings61 = new ArrayList<>();
        strings61.add("اليورانيوم");
        strings61.add("الغاز الطبيعي");
        strings61.add("الخث");
        strings61.add("البترول");
        question61.setAnswer_list(strings61);
//
        Qustion question62 = new Qustion();
        question62.setName("ما المورد الذي يتواجد في صحراء النقب و يدخل في انتاج الطاقة النووية هو ؟");
        question62.setCorrect_answer("اليورانيوم");
        ArrayList<String> strings62 = new ArrayList<>();
        strings62.add("اليورانيوم");
        strings62.add("البترول");
        strings62.add("الغاز الطبيعي");
        strings62.add("الخث");
        question62.setAnswer_list(strings62);
//
        Qustion question63 = new Qustion();
        question63.setName("ما الصخور التي تتواجد بالقرب من اريحا و وسط النقب و شماله ؟");
        question63.setCorrect_answer("الزيتية");
        ArrayList<String> strings63 = new ArrayList<>();
        strings63.add("الجرانيت");
        strings63.add("الصوان");
        strings63.add("الحجر الجيري");
        strings63.add("الزيتية");
        question63.setAnswer_list(strings63);
//
        Qustion question64 = new Qustion();
        question64.setName("ما المعادن التي من خصائصها عند استخلاصها انها قابلة للطرق و السحب ؟");
        question64.setCorrect_answer("المعادن الفلزية");
        ArrayList<String> strings64 = new ArrayList<>();
        strings64.add("الوقود المعدني العضوي");
        strings64.add("المعادن الفلزية");
        strings64.add("المعادن اللافلزية");
        strings64.add("الاملاح");
        question64.setAnswer_list(strings64);
//
        Qustion question65 = new Qustion();
        question65.setName("ما معادن الطاقة المعلن عن اكتشافها حديثا في فلسطين ؟");
        question65.setCorrect_answer("الغاز الطبيعي و البترول");
        ArrayList<String> strings65 = new ArrayList<>();
        strings65.add("الفحم الحجري");
        strings65.add("الغاز الطبيعي و البترول");
        strings65.add("اليورانيوم");
        strings65.add("الصخر الزيتي");
        question65.setAnswer_list(strings65);

        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        questions.add(question48);
        questions.add(question49);
        questions.add(question50);
        questions.add(question51);
        questions.add(question52);
        questions.add(question53);
        questions.add(question54);
        questions.add(question55);
        questions.add(question56);
        questions.add(question57);
        questions.add(question58);
        questions.add(question59);
        questions.add(question60);
        questions.add(question61);
        questions.add(question62);
        questions.add(question63);
        questions.add(question64);
        questions.add(question65);
        setData(0);
        updateScore(0);

    }

    private void Question_8() {

        Qustion question20 = new Qustion();
        question20.setName("ما المحرك الاساسي في حياة الانسان و التي من خلالها تنجز الاعمال ؟");
        question20.setCorrect_answer("الطاقة");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("الطاقة");
        strings20.add("الاملاح المعدنية");
        strings20.add("المعادن الفلزية");
        strings20.add("المعادن اللافلزية");
        question20.setAnswer_list(strings20);
//
        Qustion question21 = new Qustion();
        question21.setName("ما اهمية الطاقة في حياة الانسان ؟");
        question21.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("وسيلة بناء وتطور");
        strings21.add("تشغل الآلات");
        strings21.add("تشغل وسائل النقل والمواصلات");
        strings21.add("كل ما ذكر");
        question21.setAnswer_list(strings21);
//
        Qustion question22 = new Qustion();
        question22.setName("ضمن أي المؤشرات يعد استهلاك الطاقة ؟");
        question22.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("التقدم الاقتصادي");
        strings22.add("التقدم الحضاري");
        strings22.add("التقدم السياسي");
        strings22.add("كل ما ذكر");
        question22.setAnswer_list(strings22);
//
        Qustion question23 = new Qustion();
        question23.setName("ما مصادر الطاقة التي تنتهي مع الزمن لكثرة الاستخدام و هي موجودة في الطبيعة بكميات محدودة ؟");
        question23.setCorrect_answer("الغير متجددة");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("المتجددة");
        strings23.add("الغير متجددة");
        strings23.add("الطاقة النظيفة");
        strings23.add("الطاقة البديلة");
        question23.setAnswer_list(strings23);
//
        Qustion question24 = new Qustion();
        question24.setName("كم تبلغ نسبة النفط من الطاقة المستخدمة في العالم ؟");
        question24.setCorrect_answer("33%");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("43%");
        strings24.add("33%");
        strings24.add("23%");
        strings24.add("13%");
        question24.setAnswer_list(strings24);
//
        Qustion question25 = new Qustion();
        question25.setName("لماذا يعتبر النفط  المصدر الرئيس للطاقة ؟");
        question25.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("لوجوده بكميات كبيرة");
        strings25.add("لسهولة النقل");
        strings25.add("لقيام كثير من الصناعات البتروكيماوية عليه");
        strings25.add("كل ما ذكر");
        question25.setAnswer_list(strings25);
//
        Qustion question26 = new Qustion();
        question26.setName("لأي الفترات الزمنية كان يشكل الفحم الحجري المصدر الاول للطاقة ؟");
        question26.setCorrect_answer("اوائل القرن العشرين");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("اوائل القرن التاسع عشر");
        strings26.add("اواخر القرن  الثامن عشر");
        strings26.add("اوائل القرن العشرين");
        strings26.add("القرن الحادي والعشرين");
        question26.setAnswer_list(strings26);
//
        Qustion question27 = new Qustion();
        question27.setName("ما اشهر الدول التي تستغل الفحم الحجري فيها كمصدر للطاقة ؟");
        question27.setCorrect_answer("الصين و الهند");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("اليابان و كندا");
        strings27.add("كوريا الجنوبية و اليابان");
        strings27.add("الصين و الهند");
        strings27.add("كندا و بريطانيا");
        question27.setAnswer_list(strings27);
//
        Qustion question28 = new Qustion();
        question28.setName("ما سبب تعرض المحطات الكهربائية و المنشآت التي تعمل بالفحم للانتقاد المتزايد ؟");
        question28.setCorrect_answer("غاز ثاني اكسيد الكربون");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("غاز ثاني اكسيد الكربون");
        strings28.add("غاز الفريون");
        strings28.add("غاز النيتروجين");
        strings28.add("غاز الاكسجين");
        question28.setAnswer_list(strings28);
//
        Qustion question29 = new Qustion();
        question29.setName("ما النسبة التي يشكلها الغاز الطبيعي كمصدر ثالث للطاقة على مستوى العالم ؟");
        question29.setCorrect_answer("24%");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("24%");
        strings29.add("20%");
        strings29.add("28.5%");
        strings29.add("15%");
        question29.setAnswer_list(strings29);
//
        Qustion question30 = new Qustion();
        question30.setName("في أي عام برزت اهمية اليورانيوم كمصدر للطاقة النووية بعد اكتشاف قوتها التدميرية ؟");
        question30.setCorrect_answer("1945م");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("1967م");
        strings30.add("1955م");
        strings30.add("1945م");
        strings30.add("1917م");
        question30.setAnswer_list(strings30);
//
        Qustion question31 = new Qustion();
        question31.setName("ما المدينتان التي استخدمت الولايات المتحدة الامريكية القنابل الذرية في قصفهما ؟");
        question31.setCorrect_answer("هيروشيما و ناجا زاكي");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("بغداد و القاهرة");
        strings31.add("هيروشيما و ناجا زاكي");
        strings31.add("طوكيو و بكين");
        strings31.add("برلين و ميونخ");
        question31.setAnswer_list(strings31);
//
        Qustion question32 = new Qustion();
        question32.setName("ما اكثر دول العالم في مجال الطاقة النووية لإنتاج الكهرباء ؟");
        question32.setCorrect_answer("اليابان و كندا");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("اليابان و كندا");
        strings32.add("ايطاليا و اسبانيا");
        strings32.add("فرنسا و بريطانيا");
        strings32.add("كوريا الجنوبية و الهند");
        question32.setAnswer_list(strings32);
//
        Qustion question33 = new Qustion();
        question33.setName("كم تشكل الطاقة المتجددة من الطاقة المستخدمة في العالم ؟");
        question33.setCorrect_answer("10%");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("40%");
        strings33.add("30%");
        strings33.add("20%");
        strings33.add("10%");
        question33.setAnswer_list(strings33);
//
        Qustion question34 = new Qustion();
        question34.setName("ماذا يطلق على عملية تحويل الطاقات المتجددة الى مصادر للدخل و الترويج لها ؟");
        question34.setCorrect_answer("تجارة الطاقة المتجددة");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("استخراج الطاقة");
        strings34.add("استنزاف الطاقة");
        strings34.add("تجارة الطاقة المتجددة");
        strings34.add("تجارة الموارد");
        question34.setAnswer_list(strings34);
//
        Qustion question35 = new Qustion();
        question35.setName("ما الطاقة التي تتنوع في مسمياتها بين طاقة بديلة و نظيفة و امنة و مستدامة ؟");
        question35.setCorrect_answer("المتجددة");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("غير المتجددة");
        strings35.add("المتجددة");
        strings35.add("الحيوية");
        strings35.add("لا تنفذ");
        question35.setAnswer_list(strings35);
//
        Qustion question36 = new Qustion();
        question36.setName("لماذا تعمل كثير من الدول على التخطيط للاستثمار في الطاقة المتجددة ومنها فلسطين ؟");
        question36.setCorrect_answer("لتفادي مخاطر الوقود الاحفوري");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("لتفادي مخاطر الوقود الاحفوري");
        strings36.add("للتقليل من الطاقة الشمسية");
        strings36.add("لاستنزاف الطاقة المائية");
        strings36.add("تلويث الطاقة الريحية");
        question36.setAnswer_list(strings36);
//
        Qustion question37 = new Qustion();
        question37.setName("ما مصدر الطاقة المتجددة الاكثر استغلالا في فلسطين و الدول العربية ؟");
        question37.setCorrect_answer("الشمس");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("الكتل الحيوية");
        strings37.add("الهواء");
        strings37.add("الماء");
        strings37.add("الشمس");
        question37.setAnswer_list(strings37);
//
        Qustion question38 = new Qustion();
        question38.setName("ما الطاقة المستخدمة في مجال التحويل الحراري و مجال التحويل الكهروضوئي ؟");
        question38.setCorrect_answer("الطاقة الشمسية");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("طاقة الرياح");
        strings38.add("الطاقة المائية");
        strings38.add("الطاقة الحيوية");
        strings38.add("الطاقة الشمسية");
        question38.setAnswer_list(strings38);
//
        Qustion question39 = new Qustion();
        question39.setName("ما الطاقة التي يتم استغلالها لتحويلها الى طاقة كهربائية من خلال مراوح تدير مولدات كهربائية ؟");
        question39.setCorrect_answer("طاقة الرياح");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("الطاقة المائية");
        strings39.add("طاقة الرياح");
        strings39.add("الطاقة الشمسية");
        strings39.add("طاقة الكتلة الحيوية");
        question39.setAnswer_list(strings39);
        //
        Qustion question40 = new Qustion();
        question40.setName("ما الاثار السلبية الناجمة عن استغلال طاقة الرياح ؟");
        question40.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("حاجتها لمساحات كبيرة من الارض الزراعية");
        strings40.add("الضجيج الناجم عن دورانها");
        strings40.add("الارهاق البصري للقاطنين قربها");
        strings40.add("كل ما ذكر");
        question40.setAnswer_list(strings40);
//
        Qustion question41 = new Qustion();
        question41.setName("ما الطاقة التي تستغل حركة المياه اثناء المد و الجزر في انتاج الطاقة الكهربائية ؟");
        question41.setCorrect_answer("الطاقة المائية");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("الطاقة الريحية");
        strings41.add("الطاقة الشمسية");
        strings41.add("الطاقة المائية");
        strings41.add("الطاقة الحيوية");
        question41.setAnswer_list(strings41);
        //
        Qustion question42 = new Qustion();
        question42.setName("ما الدول التي تستغل الانهار في توليد الطاقة الكهربائية من خلال المياه المتدفقة عبر السدود ؟");
        question42.setCorrect_answer("مصر وتركيا");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("مصر وتركيا");
        strings42.add("الارجنتين والبرازيل");
        strings42.add("هولندا وبريطانيا");
        strings42.add("السويد والنرويج");
        question42.setAnswer_list(strings42);
//
        Qustion question43 = new Qustion();
        question43.setName("ماذا يطلق على المواد المشتقة من النبات التي يمكن استخدامها لإنتاج الطاقة ؟");
        question43.setCorrect_answer("طاقة الكتلة الحيوية");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("طاقة الرياح");
        strings43.add("الطاقة المائية");
        strings43.add("طاقة الكتلة الحيوية");
        strings43.add("الطاقة الشمسية");
        question43.setAnswer_list(strings43);
//
        Qustion question44 = new Qustion();
        question44.setName("ما سبب زيادة الطلب المتوقعة على الغاز الطبيعي كمصدر للطاقة ؟");
        question44.setCorrect_answer("اقل تلويثا للبيئة و يحتوي على وحدات حرارية عالية");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("سهولة استخراجه");
        strings44.add("سهولة نقله");
        strings44.add("قلة تكلفة انتاجه");
        strings44.add("اقل تلويثا للبيئة و يحتوي على وحدات حرارية عالية");
        question44.setAnswer_list(strings44);
//
        Qustion question45 = new Qustion();
        question45.setName("ما مصدر الطاقة الذي تقوم عليه صناعة اللدائن و الألياف الصناعية ؟");
        question45.setCorrect_answer("النفط");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("النفط");
        strings45.add("الغاز");
        strings45.add("الفحم الحجري");
        strings45.add("اليورانيوم");
        question45.setAnswer_list(strings45);
//
        Qustion question46 = new Qustion();
        question46.setName("ما المبدأ الذي يقوم عليه استغلال الطاقة الشمسية في مجال التحويل الحراري ؟");
        question46.setCorrect_answer("امتصاص الاجسام الداكنة للأشعة و تحويلها الى حرارة");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("امتصاص الاجسام الداكنة للأشعة و تحويلها الى حرارة");
        strings46.add("امتصاص الاجسام الفاتحة للأشعة و تحويلها الى حرارة");
        strings46.add("عكس الاجسام الداكنة للأشعة و تحويلها الى حرارة");
        strings46.add("عكس الاجسام الفاتحة للأشعة و تحويلها الى حرارة");
        question46.setAnswer_list(strings46);
//
        Qustion question47 = new Qustion();
        question47.setName("ما مصدر الطاقة الذي يمكن استغلاله من النفايات و المخلفات الزراعية و الحيوانية ؟");
        question47.setCorrect_answer("الكتل الحيوية");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("الفحم الحجري");
        strings47.add("اليورانيوم");
        strings47.add("الكتل الحيوية");
        strings47.add("البترول");
        question47.setAnswer_list(strings47);


        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        setData(0);
        updateScore(0);
    }

    private void Question_9() {

        Qustion question20 = new Qustion();
        question20.setName("ما النباتات التي تنمو في الطبيعة و لا دخل للإنسان فيها ؟");
        question20.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("الغابات");
        strings20.add("الاحراج");
        strings20.add("الحشائش والاعشاب");
        strings20.add("كل ما ذكر");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("ما العوامل التي تؤدي الى اختلاف النباتات في صفاتها و توزيعها و كثافتها");
        question21.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("التربة والتضاريس");
        strings21.add("الحرارة والضوء");
        strings21.add("المياه");
        strings21.add("كل ما ذكر");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("ما الوسط الحيوي اللازم لنمو الغطاء النباتي ؟");
        question22.setCorrect_answer("التربة");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("التربة");
        strings22.add("المياه");
        strings22.add("الهواء");
        strings22.add("المياه و الهواء");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("ما سبب اختلاف نوع الغطاء النباتي و كثافته ؟");
        question23.setCorrect_answer("درجة انحدار السفوح الجبلية");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("درجة انحدار السفوح الجبلية");
        strings23.add("درجة انحدار السهول");
        strings23.add("درجة انحدار الاودية");
        strings23.add("درجة انحدار الهضاب");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("الى ماذا تعود كثافة الغطاء النباتي ؟");
        question24.setCorrect_answer("كبر سمك التربة");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("قلة سمك التربة");
        strings24.add("انعدام وجود التربة");
        strings24.add("كبر سمك التربة");
        strings24.add("كل ما ذكر");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("ضمن أي السفوح الجبلية يزداد وجود الغطاء النباتي و كثافته ؟");
        question25.setCorrect_answer("المواجهة للرياح الرطبة");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("الواقعة في ظل المطر");
        strings25.add("المواجهة للرياح الرطبة");
        strings25.add("المواجهة للرياح الجافة");
        strings25.add("الموازية للرياح الجافة");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("لماذا يقل الغطاء النباتي في المناطق القطبية و شبه القطبية ؟");
        question26.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("نقص كمية الضوء");
        strings26.add("انخفاض الحرارة");
        strings26.add("انخفاض الرطوبة");
        strings26.add("كل ما ذكر");

        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("لماذا يتميز الغطاء النباتي بكثافته في المناطق الاستوائية و المدارية ؟");
        question27.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("توفر الحرارة");
        strings27.add("توفر الضوء");
        strings27.add("توفر الرطوبة");
        strings27.add("كل ما ذكر");
        question27.setAnswer_list(strings27);


        Qustion question28 = new Qustion();
        question28.setName("ماذا يطلق على الاشجار الكثيفة و المتشابكة ؟");
        question28.setCorrect_answer("الغابات");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("الاحراج");
        strings28.add("الاستبس");
        strings28.add("المراعي");
        strings28.add("الغابات");

        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("ما الغابات التي تظهر في المناطق السهلية الاستوائية مثل اندونيسيا و جنوب شرق اسيا ؟");
        question29.setCorrect_answer("الغابات الاستوائية");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("الغابات النفضية");
        strings29.add("الغابات المخروطية");
        strings29.add("الغابات الاستوائية");
        strings29.add("الغابات الموسمية");

        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("بماذا تمتاز الغابات الاستوائية ؟");
        question30.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("كثافة الاشجار");
        strings30.add("ضخامة الاشجار");
        strings30.add("ارتفاعها الذي يصل 60م");
        strings30.add("كل ما ذكر");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("ما اشجار الغابات الاستوائية ؟");
        question31.setCorrect_answer("الابنوس و المطاط");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("الابنوس و المطاط");
        strings31.add("الخيزران و نخيل الزيت");
        strings31.add("الزان والفلين");
        strings31.add("السرو و الصنوبر");

        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ما الغابات التي تتوزع في حوض نهر الامازون و حوض نهر الكونغو و نهر الزمبيزي ؟");
        question32.setCorrect_answer("الاستوائية");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("الاستوائية");
        strings32.add("الموسمية");
        strings32.add("الصنوبرية");
        strings32.add("النفضية");
        question32.setAnswer_list(strings32);


        Qustion question33 = new Qustion();
        question33.setName("ما الغابات التي تأتي في المرتبة الثانية من حيث انتشارها ؟");
        question33.setCorrect_answer("الموسمية");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("الاستوائية");
        strings33.add("النفضية");
        strings33.add("الموسمية");
        strings33.add("المخروطية");
        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("بماذا تمتاز الغابات الموسمية ؟");
        question34.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("اقل كثافة من الاستوائية");
        strings34.add("تختلط معها الحشائش الطويلة");
        strings34.add("تختلط معها الحشائش القصيرة");
        strings34.add("كل ما ذكر");

        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("ما اهم الاشجار في الغابات الموسمية ؟");
        question35.setCorrect_answer("الخيزران ونخيل الزيت");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("الابنوس والمطاط");
        strings35.add("الخيزران ونخيل الزيت");
        strings35.add("الزان والفلين");
        strings35.add("السرو والصنوبر");
        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("ما الغابات التي تنتشر في جنوب و جنوب شرق اسيا و شمال استراليا ؟");
        question36.setCorrect_answer("الموسمية");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("الاستوائية");
        strings36.add("الموسمية");
        strings36.add("النفضية");
        strings36.add("المخروطية");
        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("ما الغابات التي تتميز بانها تنفض اوراقها في احد الفصول (فصل الخريف) ؟");
        question37.setCorrect_answer("النفضية");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("الاستوائية");
        strings37.add("الموسمية");
        strings37.add("الصنوبرية");
        strings37.add("النفضية");
        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("ما الغابات التي تظهر غرب القارات بين دائرتي عرض ( 40 – 60 ) شمال و جنوب خط الاستواء ؟");
        question38.setCorrect_answer("النفضية");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("الموسمية");
        strings38.add("الاستوائية");
        strings38.add("النفضية");
        strings38.add("المخروطية");
        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("اين تظهر الغابات النفضية التي تقع بين دائرتي عرض ( 40 – 60 ) شمال و جنوب خط الاستواء ؟");
        question39.setCorrect_answer("غرب و وسط اوروبا");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("غرب و وسط اوروبا");
        strings39.add("جزيرة مدغشقر");
        strings39.add("جزيرة جرينلاند");
        strings39.add("جزر الفلبين");
        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("ما اهم الاشجار في الغابات النفضية ؟");
        question40.setCorrect_answer("الزان والفلين");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("الابنوس والمطاط");
        strings40.add("الخيزران ونخيل الزيت");
        strings40.add("الزان والفلين");
        strings40.add("السرو والصنوبر");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("عند اي دائرة عرض تظهر الغابات الصنوبرية ( المخروطية )  شمال القارات ؟ ");
        question41.setCorrect_answer("45 شمالا");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("55 شمالا");
        strings41.add("45 شمالا");
        strings41.add("65 شمالا");
        strings41.add("75 شمالا");
        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("ما الغابات ذات الشكل المخروط و اوراقها ابرية و جذوعها مستقيمة ؟");
        question42.setCorrect_answer("الصنوبرية");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("الموسمية");
        strings42.add("النفضية");
        strings42.add("الصنوبرية");
        strings42.add("الاستوائية");
        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("على ماذا يطلق مفهوم الاشجار قليلة الكثافة والارتفاع و المساحة و يصل فيها فصل جفاف الى ستة اشهر ؟");
        question43.setCorrect_answer("الاحراج");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("الحشائش");
        strings43.add("الاعشاب");
        strings43.add("الغابات");
        strings43.add("الاحراج");

        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("اين تتركز الاحراج في فلسطين ؟");
        question44.setCorrect_answer("مرتفعات الشمال والوسط");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("السهل الساحلي");
        strings44.add("مرتفعات الشمال والوسط");
        strings44.add("الاغوار");
        strings44.add("النقب");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("لأي انواع  الغطاء النباتي تنتمي اشجار الأرز و البطم و السويد ؟");
        question45.setCorrect_answer("الاحراج");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("الغابات الاستوائية");
        strings45.add("الغابات الموسمية");
        strings45.add("الغابات النفضية");
        strings45.add("الاحراج");
        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("اين تقع محمية ام الريحان شمال ؟");
        question46.setCorrect_answer("شمال غرب جنين");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("شمال غرب سلفيت");
        strings46.add("شمال غرب القدس");
        strings46.add("شمال غرب جنين");
        strings46.add("شمال غرب الخليل");

        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("اين تقع احراج وادي قانا ؟");
        question47.setCorrect_answer("قرب سلفيت");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("قرب رام الله");
        strings47.add("قرب نابلس");
        strings47.add("قرب طولكرم");
        strings47.add("قرب سلفيت");

        question47.setAnswer_list(strings47);

        Qustion question48 = new Qustion();
        question48.setName("اين تقع احراج اللطرون ؟");
        question48.setCorrect_answer("غرب القدس");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("غرب القدس");
        strings48.add("غرب يافا");
        strings48.add("غرب حيفا");
        strings48.add("غرب عكا");
        question48.setAnswer_list(strings48);

        Qustion question49 = new Qustion();
        question49.setName("لماذا يسيطر الاحتلال الصهيوني على معظم المحميات الطبيعية في فلسطين ؟");
        question49.setCorrect_answer("أ + ب");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("لاعتبارها محميات طبيعية");
        strings49.add("لأنها مناطق مغلقة تسهيلا لمصادرتها");
        strings49.add("لأنها مناطق سكنية");
        strings49.add("أ + ب");
        question49.setAnswer_list(strings49);

        Qustion question50 = new Qustion();
        question50.setName("في أي مناطق العالم تنمو الحشائش ؟");
        question50.setCorrect_answer("قليلة الامطار");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("غزيرة الامطار");
        strings50.add("متوسطة الامطار");
        strings50.add("قليلة الامطار");
        strings50.add("كل ما ذكر");
        question50.setAnswer_list(strings50);

        Qustion question51 = new Qustion();
        question51.setName("بماذا تتميز حشائش السافانا ؟");
        question51.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("خشونتها");
        strings51.add("يزيد ارتفاعها عن المتر");
        strings51.add("تتخللها بعض الشجيرات");
        strings51.add("كل ما ذكر");
        question51.setAnswer_list(strings51);

        Qustion question52 = new Qustion();
        question52.setName("ما الحشائش التي تنتشر جنوب شرق اسيا و هضبة الدكن و هضبة البرازيل و جنوب السودان ؟");
        question52.setCorrect_answer("حشائش السافانا");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("اللانوس");
        strings52.add("البمباس");
        strings52.add("حشائش السافانا");
        strings52.add("حشائش الاستبس");
        question52.setAnswer_list(strings52);

        Qustion question53 = new Qustion();
        question53.setName("في أي المناطق تنمو حشائش الاستبس ؟");
        question53.setCorrect_answer("شبه الجافة");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("شبه الجافة");
        strings53.add("الجافة");
        strings53.add("لاستوائية");
        strings53.add("الصحراوية");
        question53.setAnswer_list(strings53);

        Qustion question54 = new Qustion();
        question54.setName("بماذا تتميز حشائش الاستبس ؟");
        question54.setCorrect_answer("ب + ج");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("يزيد ارتفاعها عن متر");
        strings54.add("قصيرة");
        strings54.add("ناعمة");
        strings54.add("ب + ج");
        question54.setAnswer_list(strings54);

        Qustion question55 = new Qustion();
        question55.setName("ما النباتات القصيرة و المتنوعة التي تنمو في مختلف انحاء العالم اثناء سقوط الامطار و تجف بنهايته ؟");
        question55.setCorrect_answer("الاعشاب");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("الاعشاب");
        strings55.add("الحشائش");
        strings55.add("الاحراج");
        strings55.add("الغابات");
        question55.setAnswer_list(strings55);

        Qustion question56 = new Qustion();
        question56.setName("ما الغابات التي تختلط فيها الحشائش الطويلة و الشجيرات القصيرة ؟");
        question56.setCorrect_answer("الغابات الموسمية");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("الغابات الاستوائية");
        strings56.add("الغابات النفضية");
        strings56.add("الغابات الموسمية");
        strings56.add("الغابات الصنوبرية");
        question56.setAnswer_list(strings56);

        Qustion question57 = new Qustion();
        question57.setName("الى أي نوع تنتمي الغابات الصنوبرية ( المخروطية )");
        question57.setCorrect_answer("المعتدلة الباردة");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("الموسمية");
        strings57.add("الاستوائية");
        strings57.add("المعتدلة الباردة");
        strings57.add("الاحراج");
        question57.setAnswer_list(strings57);

        Qustion question58 = new Qustion();
        question58.setName("ما اهم الامور التي تتجلى اهمية الموارد النباتية الطبيعية فيها ؟");
        question58.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("حفظ رطوبة التربة");
        strings58.add("تحقيق التوازن البيئي");
        strings58.add("الحد من التصحر");
        strings58.add("كل ما ذكر");
        question58.setAnswer_list(strings58);

        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        questions.add(question48);
        questions.add(question49);
        questions.add(question50);
        questions.add(question51);
        questions.add(question52);
        questions.add(question53);
        questions.add(question54);
        questions.add(question55);
        questions.add(question56);
        questions.add(question57);
        questions.add(question58);
        setData(0);
        updateScore(0);

    }

    private void Question_10() {

        Qustion question20 = new Qustion();
        question20.setName("ما الاسم الذي اصبح يعرف به الانسان اليوم بلغة الاقتصاديين ؟");
        question20.setCorrect_answer("رأس المال البشري");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("رأس المال البشري");
        strings20.add("القوى العاملة");
        strings20.add("مستخدم");
        strings20.add("اداري");
        question20.setAnswer_list(strings20);
//
        Qustion question21 = new Qustion();
        question21.setName("ماذا يطلق على السكان داخل اراضي الدولة و يشكلون احد اركانها و عنصرا اساسيا في احداث التنمية الشاملة؟");
        question21.setCorrect_answer("الموارد البشرية");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("الموارد الطبيعية");
        strings21.add("الموارد البشرية");
        strings21.add("المصادر الطبيعية");
        strings21.add("المصادر البشرية");
        question21.setAnswer_list(strings21);
//
        Qustion question22 = new Qustion();
        question22.setName("ما الفئة العمرية التي تضم القوى العاملة من الموارد البشرية المهمة في الدولة ؟");
        question22.setCorrect_answer("(15 – 64 سنة)");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("( 5 – 10 سنة)");
        strings22.add("اقل من (5 سنوات)");
        strings22.add("(15 – 64 سنة)");
        strings22.add("( 65 سنة فما فوق )");
        question22.setAnswer_list(strings22);
//
        Qustion question23 = new Qustion();
        question23.setName("ما المستوى الذي يلعب دورا مهما في استغلال الموارد الطبيعية و تطور قطاعات الانتاج بشكل اقتصادي ؟");
        question23.setCorrect_answer("المستوى العلمي والتكنولوجي");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("المستوى العلمي والتكنولوجي");
        strings23.add("التوزيع الجغرافي للموارد");
        strings23.add("السياسة الاقتصادية للحكومة");
        strings23.add("راس المال المتاح");
        question23.setAnswer_list(strings23);
//
        Qustion question24 = new Qustion();
        question24.setName("كيف تلجأ الحكومات لحماية منتجاتها الوطنية من منافسة المنتوجات الاجنبية المماثلة لها ؟");
        question24.setCorrect_answer("وضع قوانين جمركية");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("وضع قوانين جمركية");
        strings24.add("خفض اسعار السلع");
        strings24.add("رفع الضرائب على السلع المحلية");
        strings24.add("زيادة الاستيراد");
        question24.setAnswer_list(strings24);
//
        Qustion question25 = new Qustion();
        question25.setName("بماذا يسهم توفر راس المال ؟");
        question25.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("تحسين المستوى المعيشي للسكان");
        strings25.add("تحسين فرص الاستثمار والانتاج");
        strings25.add("تعويض نقص السلع من خلال الاستيراد");
        strings25.add("كل ما ذكر");
        question25.setAnswer_list(strings25);
//
        Qustion question26 = new Qustion();
        question26.setName("على ماذا يطلق الوظائف الرئيسية للمنشآت و المؤسسات الموجودة في الدولة ؟");
        question26.setCorrect_answer("ادارة الموارد البشرية");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("ادارة الموارد البشرية");
        strings26.add("ادارة الموارد الطبيعية");
        strings26.add("التوزيع الجغرافي للموارد البشرية");
        strings26.add("السياسة الاقتصادية للحكومة");
        question26.setAnswer_list(strings26);
//
        Qustion question27 = new Qustion();
        question27.setName("ما الحق السياسي الذي يعد من متطلبات ادارة الموارد البشرية ؟");
        question27.setCorrect_answer("التعبير و الانتخاب");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("التعبير و الانتخاب");
        strings27.add("الاستثمار");
        strings27.add("توفير الخدمات");
        strings27.add("فرص العمل");
        question27.setAnswer_list(strings27);
//
        Qustion question28 = new Qustion();
        question28.setName("أي من الحقوق الاقتصادية الاتية  يعد من متطلبات ادارة الموارد البشرية ؟");
        question28.setCorrect_answer("ب + ج");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("الانتخاب و التعبير");
        strings28.add("توفير فرص العمل و استثمار الاموال");
        strings28.add("ممارسة التجارة و حرية تصرف الفرد بأمواله");
        strings28.add("ب + ج");
        question28.setAnswer_list(strings28);
//
        Qustion question29 = new Qustion();
        question29.setName("ما الحق الاجتماعي الذي يعد من متطلبات ادارة الموارد البشرية ؟");
        question29.setCorrect_answer("توفير الخدمات");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("الانتخاب");
        strings29.add("الاستثمار");
        strings29.add("توفير الخدمات");
        strings29.add("فرص العمل");
        question29.setAnswer_list(strings29);
//
        Qustion question30 = new Qustion();
        question30.setName("ما الفئة التي تشملها الموارد البشرية ؟");
        question30.setCorrect_answer("كل فئات السكان");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("كل فئات السكان");
        strings30.add("صغار السن");
        strings30.add("الشباب");
        strings30.add("كبار السن");
        question30.setAnswer_list(strings30);
//
        Qustion question31 = new Qustion();
        question31.setName("ما الفئة التي تشملها القوى العاملة ؟");
        question31.setCorrect_answer("العاملين و العاطلين عن العمل و الراغبين فيه");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("العاملين فقط");
        strings31.add("فئة الشباب و كبار السن");
        strings31.add("كل فئات السكان");
        strings31.add("العاملين و العاطلين عن العمل و الراغبين فيه");
        question31.setAnswer_list(strings31);
//
        Qustion question32 = new Qustion();
        question32.setName("ما اهمية ادارة الموارد البشرية ؟");
        question32.setCorrect_answer("كل ما ذكر صحيح");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("تحقيق اعلى كفاءة انتاجية ممكنة");
        strings32.add("توفير قوى عاملة متميزة في الاداء");
        strings32.add("زيادة درجة الانتماء و وضع نظام لقياس اداء العاملين");
        strings32.add("كل ما ذكر صحيح");
        question32.setAnswer_list(strings32);
//
        Qustion question33 = new Qustion();
        question33.setName("ما المعيقات و التحديات التي تواجه ادارة الموارد البشرية ؟");
        question33.setCorrect_answer("كل ما ذكر صحيح");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("ضعف مشاركة الموارد البشرية في اتخاذ القرارات");
        strings33.add("تحديات و احتياجات سوق العمل و توجهاته");
        strings33.add("تحديات مقاومة التغيير و التنافس العالمي");
        strings33.add("كل ما ذكر صحيح");
        question33.setAnswer_list(strings33);
//
        Qustion question34 = new Qustion();
        question34.setName("ما اهم الحلول لمواجهة التحديات التي تواجه ادارة الموارد البشرية ؟");
        question34.setCorrect_answer("كل ما ذكر صحيح");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("تبني فلسفة ادارة الموارد البشرية");
        strings34.add("استخدام ادوات التحفيز");
        strings34.add("زيادة الاستثمار في رأس المال البشري");
        strings34.add("كل ما ذكر صحيح");
        question34.setAnswer_list(strings34);
//
        Qustion question35 = new Qustion();
        question35.setName("ما اهمية رأس المال المتاح للموارد البشرية ؟");
        question35.setCorrect_answer("كل ما ذكر صحيح");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("تحسين المستوى المعيشي للسكان");
        strings35.add("تحسين فرص الاستثمار و الانتاج");
        strings35.add("تعويض النقص في بعض السلع من خلال الاستيراد");
        strings35.add("كل ما ذكر صحيح");
        question35.setAnswer_list(strings35);
//
        Qustion question36 = new Qustion();
        question36.setName("ما المفهوم الذي يعبر عن تثبيت سعر محصول او منتج عند هبوط سعره و تقوم الحكومة بدعمه او شرائه ثم تصريفه للأسواق ؟");
        question36.setCorrect_answer("سياسة تعزيز الاسعار");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("سياسة تشجيع الاستيراد");
        strings36.add("سياسة تعزيز الاحتكار");
        strings36.add("سياسة تعزيز الاسعار");
        strings36.add("سياسة التقشف");
        question36.setAnswer_list(strings36);
        //
        Qustion question37 = new Qustion();
        question37.setName("ما الحق الاقتصادي الذي يعد من متطلبات ادارة الموارد البشرية ؟");
        question37.setCorrect_answer("استثمار الاموال");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("التعبير عن الرأي");
        strings37.add("استثمار الاموال");
        strings37.add("توفير الخدمات الصحية");
        strings37.add("الانتخاب");
        question37.setAnswer_list(strings37);

        //insert data in the Qustion
        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        setData(0);
        updateScore(0);
    }
    //update الثالثة
    private void Question_11() {
        Qustion question20 = new Qustion();
        question20.setName("ما مفهوم الحادثة الغير متوقعة الناجمة عن قوى الطبيعة او بسبب فعل الانسان و تؤدي الى خسائر بشرية او بيئية ؟");
        question20.setCorrect_answer("الكارثة");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("النكبة");
        strings20.add("النكسة");
        strings20.add("الكارثة");
        strings20.add("الحرب");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("ماذا تعني نكبة الشعب الفلسطيني عام 1948م ؟");
        question21.setCorrect_answer("المجازر");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("التهجير");
        strings21.add("المجازر");
        strings21.add("الاستيلاء على الأرض");
        strings21.add("كل ما ذكر");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("ماذا تعني نكسة الشعب الفلسطيني عام 1967م ؟");
        question22.setCorrect_answer("كل ما ذكر");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("التهجير");
        strings22.add("سياسة الاستيطان");
        strings22.add("احتلال الضفة الغربية");
        strings22.add("كل ما ذكر");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("ماهي الكوارث التي تحدث من تلقاء نفسها و ليس للإنسان أي دور في حدوثها و تسبب دمارا و خسائر ؟");
        question23.setCorrect_answer("كوارث الحروب");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("الكوارث البشرية");
        strings23.add("الكوارث الطبيعية");
        strings23.add("كوارث الحروب");
        strings23.add("كوارث متعمدة");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("أي الكوارث التالية لا تعتبر كوارث طبيعية ؟");
        question24.setCorrect_answer("كوارث كونية و مناخية");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("كوارث جيولوجية");
        strings24.add("كوارث كونية و مناخية");
        strings24.add("بيولوجية");
        strings24.add("حوادث النقل الجوي و البري");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("ضمن أي الكوارث تنتمي الزلازل و البراكين ؟");
        question25.setCorrect_answer("المناخية");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("البيولوجية");
        strings25.add("الكونية");
        strings25.add("الجيولوجية");
        strings25.add("المناخية");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("ما نوع الكوارث التي تنتمي اليها الاوبئة و الآفات الزراعية و الجراد ؟ ");
        question26.setCorrect_answer("المناخية");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("الكونية");
        strings26.add("البيولوجية");
        strings26.add("المناخية");
        strings26.add("الجيولوجية");

        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("ما نوع الكوارث التي تنتمي اليها اصطدام النيازك بسطح الارض ؟");
        question27.setCorrect_answer("الكونية");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("الجيولوجية");
        strings27.add("الكونية");
        strings27.add("البيولوجية");
        strings27.add("المناخية");
        question27.setAnswer_list(strings27);

        Qustion question28 = new Qustion();
        question28.setName("ضمن أي كوارث يعد انحباس الامطار و الفيضانات و العواصف الرعدية و الاعاصير ؟");
        question28.setCorrect_answer("الجيولوجية");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("البيولوجية");
        strings28.add("الجيولوجية");
        strings28.add("الكونية");
        strings28.add("المناخية");

        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("ما الكوارث التي تحدث بفعل ممارسات الانسان بشكل متعمد او غير متعمد ؟");
        question29.setCorrect_answer("الكوارث الكونية");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("الكوارث البشرية");
        strings29.add("الكوارث الطبيعية");
        strings29.add("الكوارث البيولوجية");
        strings29.add("الكوارث الكونية");

        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("ضد من الكوارث المتعمدة كالحرائق بفعل الحروب مثل احتراق غابات فيتنام في حربها بين عامي ( 1965 – 1975 م ) ");
        question30.setCorrect_answer("القوات الامريكية");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("القوات الامريكية");
        strings30.add("القوات الفرنسية");
        strings30.add("القوات الالمانية");
        strings30.add("القوات البريطانية");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("من الكوارث المتعمدة اشعال ابار النفط في الخليج العربي بين عامي :");
        question31.setCorrect_answer("(1991 – 2003م)");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("(1991 – 2003م)");
        strings31.add("(1995 – 2005م)");
        strings31.add("(1989 – 2000م)");
        strings31.add("(2010 – 2013م)");
        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ضمن أي الكوارث يصنف التلوث بالنفايات الصلبة من الكوارث ؟");
        question32.setCorrect_answer("المتعمدة");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("غير متعمدة");
        strings32.add("المتعمدة");
        strings32.add("الطبيعية");
        strings32.add("بيولوجية");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("ضمن أي الكوارث تصنف حوادث النقل سواء النقل البري او المائي او الجوي من الكوارث ؟");
        question33.setCorrect_answer("الغير المتعمدة");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("المتعمدة");
        strings33.add("الغير المتعمدة");
        strings33.add("الجيولوجية");
        strings33.add("البيولوجية");

        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("ضمن أي الكوارث  يعد انهيار المنشآت بسبب اخطاء التصميم من الكوارث ؟");
        question34.setCorrect_answer("غير متعمدة");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("غير متعمدة");
        strings34.add("المتعمدة");
        strings34.add("الطبيعية");
        strings34.add("الكونية");

        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("ضمن أي الكوارث تعد الحوادث الناتجة عن اهمال الانسان . مثل استخدام النار اثناء النزهات في الغابات و تركها مشتعلة؟");
        question35.setCorrect_answer("الغير متعمدة");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("الطبيعية");
        strings35.add("المتعمدة");
        strings35.add("الغير متعمدة");
        strings35.add("المناخية");

        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("متى حدثت كارثة مفاعل تشرنوبل في اوكرانيا التي تعد اكبر كارثة نووية شهدها العالم عام ؟");
        question36.setCorrect_answer("1986 م");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("1966 م");
        strings36.add("1976 م");
        strings36.add("1986 م");
        strings36.add("1996 م");

        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("كم بلغ عدد ضحايا كارثة مفاعل تشرنوبل في اوكرانيا عام 1986م  ؟");
        question37.setCorrect_answer("200 موظف");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("500 موظف");
        strings37.add("400 موظف");
        strings37.add("300 موظف");
        strings37.add("200 موظف");

        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("ما نوع الكارثة التي تعرضت لها مدينتا هيروشيما و ناجا زاكي في اليابان عام 1945 م ؟");
        question38.setCorrect_answer("نووية");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("زلزالية");
        strings38.add("بركانية");
        strings38.add("نووية");
        strings38.add("إعصاريه");

        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("ما المثال الذي ينطبق على الكوارث البيولوجية ؟");
        question39.setCorrect_answer("الأوبئة و الأمراض");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("الزلازل");
        strings39.add("الأوبئة و الأمراض");
        strings39.add("المذنبات");
        strings39.add("النيازك");
        question39.setAnswer_list(strings39);

        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        updateScore(0);
        setData(0);


    }

    private void Question_12() {

        Qustion question19 = new Qustion();
        question19.setName("ما سبب اعتبار الكرة الارضية ليست هادئة جيولوجيا بل باطنها نشط ؟");
        question19.setCorrect_answer("");
        ArrayList<String> strings19 = new ArrayList<>();
        strings19.add("الطاقة");
        strings19.add("الضغط");
        strings19.add("المواد المنصهرة");
        strings19.add("كل ما ذكر");
        question19.setAnswer_list(strings19);


        Qustion question20 = new Qustion();
        question20.setName("ما مفهوم الظاهرة الطبيعية الناتجة عن اهتزاز او سلسلة الاهتزازات الارتجاجية ؟");
        question20.setCorrect_answer("");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("البراكين");
        strings20.add("الاعاصير");
        strings20.add("الزلازل");
        strings20.add("العواصف الرعدية");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("ما سبب عدم شعور معظم الناس بحدوث الزلازل ؟");
        question21.setCorrect_answer("");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("ضعفها");
        strings21.add("بعدها عن الاماكن المأهولة بالسكان");
        strings21.add("أ + ب");
        strings21.add("قوتها");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("تعد الزلازل من اكثر الكوارث الطبيعية التي تسبب اضرارا لأنها تحدث بشكل ");
        question22.setCorrect_answer("");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("فجائي");
        strings22.add("متوقع");
        strings22.add("غير متوقع");
        strings22.add("أ + ج");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("ما العامل الذي لا يسهم في حدوث الزلازل ؟");
        question23.setCorrect_answer("");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("حركة الصفائح التكتونية");
        strings23.add("الانفجارات البركانية");
        strings23.add("الانسان");
        strings23.add("امواج تسونامي");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("ما المسبب الاول لحدوث الزلازل ؟");
        question24.setCorrect_answer("");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("الانسان");
        strings24.add("حركة الصفائح التكتونية");
        strings24.add("الانفجارات البركانية");
        strings24.add("الانفجارات النووية");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("ما التي تحدث عندما تتصادم الصفائح الأرضية ، او تنزلق احداها تحت الاخرى ؟");
        question25.setCorrect_answer("");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("الموجات الزلزالية");
        strings25.add("الموجات البحرية");
        strings25.add("الموجات الهوائية");
        strings25.add("الموجات الصوتية");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("ماذا تسمى الموجات التي تحدث عند انتهاء الموجات الزلزالية ؟");
        question26.setCorrect_answer("");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("الموجات البحرية");
        strings26.add("الموجات الهوائية");
        strings26.add("الموجات الارتدادية");
        strings26.add("الموجات الصوتية");
        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("ما التي تحدث نتيجة لصعود المواد المنصهرة ( الماغما ) من باطن الارض الى اعلى ؟");
        question27.setCorrect_answer("");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("الانفجارات البركانية");
        strings27.add("الانفجارات النووية");
        strings27.add("الينابيع المائية");
        strings27.add("البحيرات البركانية");
        question27.setAnswer_list(strings27);

        Qustion question28 = new Qustion();
        question28.setName("ما نسبة الزلازل التي تحدث في المحيط الهادي ؟");
        question28.setCorrect_answer("");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("50 %");
        strings28.add("68 %");
        strings28.add("70 %");
        strings28.add("86 %");
        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("ما هو الحزام الزلزالي الذي يمتد من جبل طارق مرورا بجبال الالب و طوروس و زاغروس و الهيمالايا و انتهاءً بجنوب شرق اسيا ؟");
        question29.setCorrect_answer("");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("حزام حلقة النار");
        strings29.add("حزام الالتواءات الالبية");
        strings29.add("حزام الاخاديد شرق افريقيا ");
        strings29.add("حزام المحيط الاطلسي");
        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("ما هي الدول الاكثر تعرضا لزلازل حزام الالتواءات الالبية ؟");
        question30.setCorrect_answer("");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("ايران و الصين");
        strings30.add("باكستان و الهند");
        strings30.add("اليابان و تايلند");
        strings30.add("افغانستان و منغوليا");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("ما الحزام الزلزالي الذي يرتبط وجود الزلازل فيه بوجود الانكسار الاسيوي الافريقي ؟");
        question31.setCorrect_answer("");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("حزام حلقة النار");
        strings31.add("حزام الالتواءات الالبية");
        strings31.add("حزام الاخاديد شرق افريقيا");
        strings31.add("حزام المحيط الاطلسي");
        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ما المظاهر الطبيعية التي تشكلت بفعل الزلازل ؟");
        question32.setCorrect_answer("");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("المنخفضات");
        strings32.add("الاغوار");
        strings32.add("الاودية الانكسارية");
        strings32.add("كل ما ذكر");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("في أي ولاية حدث انكسار سان اندرياس في الولايات المتحدة الامريكية ؟");
        question33.setCorrect_answer("");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("لوس أنجلوس");
        strings33.add("فلوريدا");
        strings33.add("كاليفورنيا");
        strings33.add("ميامي");
        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("ما المنطقة الفلسطينية التي تعرضت لانكسارات اثرت في تضاريسها ؟");
        question34.setCorrect_answer("");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("الساحل الفلسطيني");
        strings34.add("جبال نابلس");
        strings34.add("النقب");
        strings34.add("اريحا و البحر الميت و الاغوار");
        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("ضمن أي جزء تقع منطقة الاغوار و البحر الميت و اريحا و بحيرة طبريا في فلسطين ؟");
        question35.setCorrect_answer("");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("الانهدام الاسيوي الافريقي");
        strings35.add("حزام الالتواءات الالبية");
        strings35.add("حزام حلقة النار");
        strings35.add("حزام المحيط الاطلسي");
        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("ما الزمن الدوري لبؤرة زلزال البحر الميت ؟");
        question36.setCorrect_answer("");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("(50 – 60 عام)");
        strings36.add("(80 – 100 عام)");
        strings36.add("(70 – 90 عام)");
        strings36.add("(100 – 150 عام)");
        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("في أي عام حدث اخر زلزال مدمر شهدته فلسطين و اثر على مدينة نابلس بشكل كبير ؟");
        question37.setCorrect_answer("");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("1917 م");
        strings37.add("1937 م");
        strings37.add("1927 م");
        strings37.add("1947 م");
        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("ما اسباب تشقق الارض و تدمير المنشآت و الطرق و انهيار الخزانات و السدود و الحرائق  ؟");
        question38.setCorrect_answer("");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("البراكين");
        strings38.add("الحركات الالتوائية");
        strings38.add("الزلازل");
        strings38.add("الانهيارات الارضية");
        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("ما المقصود بالأمواج المائية الضخمة التي يزيد ارتفاعها عن 30م تحدث عندما يكون مركز الزلازل في قاع البحار و المحيطات ؟");
        question39.setCorrect_answer("");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("امواج تسونامي");
        strings39.add("حركة المد");
        strings39.add("حركة الجزر");
        strings39.add("التيارات البحرية");
        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("كم بلغ عدد الضحايا في تسونامي المحيط الهندي عام 2004 م ؟");
        question40.setCorrect_answer("");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("200الف شخص");
        strings40.add("300الف شخص");
        strings40.add("400الف شخص");
        strings40.add("500الف شخص");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("ما الدولة التي كان لها النصيب الاكبر من مخاطر تسونامي في المحيط الهندي عام 2004 م ؟");
        question41.setCorrect_answer("");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("اليابان");
        strings41.add("الصين");
        strings41.add("باكستان");
        strings41.add("اندونيسيا");
        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("أي من الاجهزة الاتية يستخدم لرصد الزلازل ؟");
        question42.setCorrect_answer("");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("الباروميتر");
        strings42.add("الهيجروميتر");
        strings42.add("السيزموغراف");
        strings42.add("ريختر");
        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("ما المقياس الذي يقيس قوة الزلازل و شدتها و هو مدرج من ( 1 – 10 درجات ) ؟");
        question43.setCorrect_answer("");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("الباروميتر");
        strings43.add("الهيجروميتر");
        strings43.add("السيزموغراف");
        strings43.add("ريختر");
        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("كيف يمكن التخفيف من مخاطر الزلازل ؟");
        question44.setCorrect_answer("");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("التأسيس الهندسي للمباني");
        strings44.add("صيانة المباني القديمة");
        strings44.add("الاضطلاع على نشرات التوعية و السلامة");
        strings44.add("كل ماذكر");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("ما المقصود بخروج المواد المنصهرة و الابخرة و الغازات من باطن الارض الى سطحها ؟");
        question45.setCorrect_answer("");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("البراكين");
        strings45.add("الزلازل");
        strings45.add("الينابيع المائية");
        strings45.add("الرماد البركاني");
        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("ما اسباب حدوث البراكين ؟");
        question46.setCorrect_answer("");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("حركة الصفائح الصخرية التصادمية");
        strings46.add("قوة ضغط الغازات و الابخرة");
        strings46.add("أ + ب");
        strings46.add("حركة الصفائح التباعدية");
        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("ما الفتحة العليا للبركان و تكون دائرية الشكل و تخرج منها الرماد البركاني ؟");
        question47.setCorrect_answer("");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("المخروط البركاني");
        strings47.add("عنق البركان");
        strings47.add("فوهة البركان");
        strings47.add("المقذوفات البركانية");
        question47.setAnswer_list(strings47);

        Qustion question48 = new Qustion();
        question48.setName("ما هو التجويف الاسطواني الشكل الذي يصل بين فوهة البركان و المواد المنصهرة ( الماغما ) ");
        question48.setCorrect_answer("");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("المخروط البركاني");
        strings48.add("عنق البركان");
        strings48.add("فوهة البركان");
        strings48.add("المقذوفات البركانية");
        question48.setAnswer_list(strings48);

        Qustion question49 = new Qustion();
        question49.setName("ما الذي يحتوي على حطام صخري او لافا متصلبة ؟");
        question49.setCorrect_answer("");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("المخروط البركاني");
        strings49.add("عنق البركان");
        strings49.add("فوهة البركان");
        strings49.add("المقذوفات البركانية");
        question49.setAnswer_list(strings49);

        Qustion question50 = new Qustion();
        question50.setName("ما  المواد التي تندفع باطن الارض الى سطحها و تتصلب بعد برودتها ؟");
        question50.setCorrect_answer("");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("المقذوفات الغازية");
        strings50.add("المخروط البركاني");
        strings50.add("المواد المنصهرة");
        strings50.add("فوهة البركان");
        question50.setAnswer_list(strings50);

        Qustion question51 = new Qustion();
        question51.setName("ما  التي تضم الابخرة و الغازات و الرماد الخارج من البركان ؟");
        question51.setCorrect_answer("");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("المخروط البركاني");
        strings51.add("الماغما");
        strings51.add("فوهة البركان");
        strings51.add("المقذوفات الغازية");
        question51.setAnswer_list(strings51);

        Qustion question52 = new Qustion();
        question52.setName("اين توجد حلقة النار ؟");
        question52.setCorrect_answer("");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("سواحل المحيط الهادي");
        strings52.add("سواحل المحيط الاطلسي");
        strings52.add("سواحل البحر المتوسط ");
        strings52.add("سواحل المحيط المتجمد الشمالي");
        question52.setAnswer_list(strings52);

        Qustion question53 = new Qustion();
        question53.setName("ما الحزام الذي يمتد فوق مرتفعات الانديز و روكي و جزر اليابان و الفلبين و اندونيسيا ؟");
        question53.setCorrect_answer("");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("حزام المحيط الاطلسي");
        strings53.add("حزام المحيط المتجمد الشمالي");
        strings53.add("حزام المحيط الهادي");
        strings53.add("حزام جنوب اوروبا");
        question53.setAnswer_list(strings53);

        Qustion question54 = new Qustion();
        question54.setName("ما ابرز البراكين في حزام جنوب اوروبا المطل على البحر المتوسط");
        question54.setCorrect_answer("");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("فيزوف و اتنا");
        strings54.add("اساما");
        strings54.add("كراكاتو");
        strings54.add("ايسلندا");
        question54.setAnswer_list(strings54);

        Qustion question55 = new Qustion();
        question55.setName("اين يقع بركان فيزوف ؟");
        question55.setCorrect_answer("");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("فرنسا");
        strings55.add("ايطاليا");
        strings55.add("المانيا");
        strings55.add("بريطانيا");
        question55.setAnswer_list(strings55);

        Qustion question56 = new Qustion();
        question56.setName("ما البراكين التي يتوقف نشاطها البركاني بسبب انسداد الشقوق نتيجة لتحرك الصفائح الارضية ؟");
        question56.setCorrect_answer("");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("البراكين النشطة");
        strings56.add("البراكين الساكنة");
        strings56.add("البراكين الخامدة");
        strings56.add("البراكين الهادئة");
        question56.setAnswer_list(strings56);

        Qustion question57 = new Qustion();
        question57.setName("ما البراكين التي تنفث الغازات و الابخرة و المقذوفات بصورة متقطعة و بشكل غير عنيف ؟");
        question57.setCorrect_answer("");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("البراكين الخامدة");
        strings57.add("البراكين الساكنة");
        strings57.add("البراكين النشطة");
        strings57.add("البراكين الثائرة");
        question57.setAnswer_list(strings57);

        Qustion question58 = new Qustion();
        question58.setName("ما  البركان الذي يقع في جزيرة صقلية الايطالية ؟");
        question58.setCorrect_answer("");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("بركان اساما");
        strings58.add("بركان كراكاتو");
        strings58.add("بركان ايسلندا");
        strings58.add("بركان اتنا");
        question58.setAnswer_list(strings58);

        Qustion question59 = new Qustion();
        question59.setName("ما تصنيف بركان اتنا من البراكين ؟");
        question59.setCorrect_answer("");
        ArrayList<String> strings59 = new ArrayList<>();
        strings59.add("النشطة");
        strings59.add("الضعيفة");
        strings59.add("الهادئة");
        strings59.add("الخامدة");
        question59.setAnswer_list(strings59);

        Qustion question60 = new Qustion();
        question60.setName("ما البراكين التي تخرج منها الابخرة و الغازات و المقذوفات بقوة بشكل مستمر ؟");
        question60.setCorrect_answer("");
        ArrayList<String> strings60 = new ArrayList<>();
        strings60.add("البراكين النشطة");
        strings60.add("البراكين الخامدة");
        strings60.add("البراكين الساكنة");
        strings60.add("البراكين الهادئة");
        question60.setAnswer_list(strings60);

        Qustion question61 = new Qustion();
        question61.setName("اين يقع بركان اساما ؟");
        question61.setCorrect_answer("");
        ArrayList<String> strings61 = new ArrayList<>();
        strings61.add("الصين");
        strings61.add("الهند");
        strings61.add("اليابان");
        strings61.add("الفلبين");
        question61.setAnswer_list(strings61);

        Qustion question62 = new Qustion();
        question62.setName("ما سبب شعورنا ببعض الهزات الارضية رغم البعد عن مركز حدوثها ؟");
        question62.setCorrect_answer("");
        ArrayList<String> strings62 = new ArrayList<>();
        strings62.add("انتقال الامواج الزلزالية عبر الطبقات الصخرية");
        strings62.add("ضعفها");
        strings62.add("بعدها عن الاماكن المأهولة بالسكان");
        strings62.add("قوتها");
        question62.setAnswer_list(strings62);


        questions.clear();
        questions.add(question19);
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        questions.add(question48);
        questions.add(question49);
        questions.add(question50);
        questions.add(question51);
        questions.add(question52);
        questions.add(question53);
        questions.add(question54);
        questions.add(question55);
        questions.add(question56);
        questions.add(question57);
        questions.add(question58);
        questions.add(question59);
        questions.add(question60);
        questions.add(question61);
        questions.add(question62);
        setData(0);
        updateScore(0);

    }

    private void Question_13() {

        Qustion question20 = new Qustion();
        question20.setName("ما المناطق التي تنشا فيها الأعاصير  ؟");
        question20.setCorrect_answer("");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("الاستوائية");
        strings20.add("المدارية");
        strings20.add("المعتدلة");
        strings20.add("القطبية");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("ما الوسط الذي يتشكل فيه الاعصار المداري ؟");
        question21.setCorrect_answer("");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("الوسط المائي البحري");
        strings21.add("الوسط المائي النهري");
        strings21.add("الوسط المائي المحيطي");
        strings21.add("كل ما ذكر");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("ما مفهوم  الرياح الشديدة التي تزيد سرعتها عن 100كم/الساعة و تكون مصحوبة بالبرق و الرعد و الامطار الغزيرة و تكون على شكل قمع ؟");
        question22.setCorrect_answer("");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("العواصف الرعدية");
        strings22.add("المنخفضات الجوية");
        strings22.add("المرتفعات الجوية");
        strings22.add("الاعاصير المدارية");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("ما اسباب حدوث الاعاصير ؟");
        question23.setCorrect_answer("");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("التيارات الهوائية الهابطة");
        strings23.add("ارتفاع الحرارة");
        strings23.add("التيارات الهوائية الصاعدة");
        strings23.add("ب + ج");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("ما الاعاصير التي تضرب السواحل الشرقية للولايات المتحدة الامريكية ؟");
        question24.setCorrect_answer("");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("اعاصير الهيريكين");
        strings24.add("اعاصير التورنادو");
        strings24.add("اعاصير التيفون");
        strings24.add("اعصار دين");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("ما السواحل التي تضربها اعاصير الهيريكين ؟");
        question25.setCorrect_answer("");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("جنوب شرق اسيا");
        strings25.add("حوض نهر المسيسيبي");
        strings25.add("سواحل غرب افريقيا");
        strings25.add("سواحل شرق الولايات المتحدة الامريكية ");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("ما الاعاصير التي تضرب حوض نهر المسيسيبي ؟");
        question26.setCorrect_answer("");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("اعاصير الهيريكين");
        strings26.add("اعاصير التورنادو");
        strings26.add("اعاصير التيفون");
        strings26.add("اعصار كاترينا");
        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("ما الحوض النهري التي تضربها اعاصير التورنادو ؟");
        question27.setCorrect_answer("");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("النيل");
        strings27.add("الدانوب");
        strings27.add("لمسيسيبي");
        strings27.add("الامازون");
        question27.setAnswer_list(strings27);

        Qustion question28 = new Qustion();
        question28.setName("ما الاعاصير التي تضرب سواحل جنوب شرق اسيا و الهند و الصين و بنغلادش ؟");
        question28.setCorrect_answer("");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("اعاصير الهيريكين");
        strings28.add("اعاصير التيفون");
        strings28.add("اعاصير التورنادو");
        strings28.add("اعصار كاترينا");
        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("ما السواحل التي تضربها اعاصير التيفون ؟");
        question29.setCorrect_answer("");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("جنوب شرق اسيا");
        strings29.add("الصين و الهند");
        strings29.add("بنغلادش");
        strings29.add("كل ما ذكر");
        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("ما الاثار المترتبة على الاعاصير المدارية ؟");
        question30.setCorrect_answer("");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("ارتفاع الامواج و حدوث الفيضانات");
        strings30.add("تدمير الممتلكات");
        strings30.add("حدوث الاصابات البشرية");
        strings30.add("كل ما ذكر");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("أي المناطق تشتهر بكثرة حدوث الاعاصير ؟");
        question31.setCorrect_answer("");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("القطبية");
        strings31.add("شبه القطبية");
        strings31.add("المدارية");
        strings31.add("المعتدلة");
        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ما  الظاهرة المناخية الطبيعية التي تحدث كل ثلاث سنوات تشهدها مياه المحيط الهادئ ؟");
        question32.setCorrect_answer("");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("ظاهرة النينو");
        strings32.add("الاعاصير المدارية");
        strings32.add("العواصف الرعدية");
        strings32.add("الجبهات الهوائية");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("اين تحدث ظاهرة النينو ؟");
        question33.setCorrect_answer("");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("المحيط الهندي");
        strings33.add("المحيط الهادئ");
        strings33.add("المحيط الاطلسي");
        strings33.add("المتجمد الشمالي");
        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("اين تتجه التيارات البحرية الدافئة بعد حدوث ظاهرة النينو في سواحل قارة اوقيانوسيا ؟");
        question34.setCorrect_answer("");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("السواحل الغربية لأمريكا الجنوبية");
        strings34.add("السواحل الشمالية لأمريكا الجنوبية");
        strings34.add("السواحل الشرقية لأمريكا الجنوبية");
        strings34.add("السواحل الجنوبية لأمريكا الجنوبية");
        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("ما التغيرات البيئية و المناخية و الاقتصادية التي تطرأ عن حدوث ظاهرة النينو ؟");
        question35.setCorrect_answer("");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("الجفاف و تدمير المحاصيل الزراعية");
        strings35.add("الفيضانات");
        strings35.add("هروب الاسماك");
        strings35.add("كل ما ذكر");
        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("ما سبب هروب الاسماك التي تعيش في الطبقة العليا من مياه المحيط الى مستويات اكثر عمقاً ؟");
        question36.setCorrect_answer("");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("انخفاض حرارة المياه السطحية");
        strings36.add("ارتفاع حرارة المياه السطحية");
        strings36.add("تجمد المياه السطحية");
        strings36.add("عمق المياه");
        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("سبب حدوث ظاهرة النينو في المحيط الهادئ ارتفاع حرارة مياهه بحوالي ");
        question37.setCorrect_answer("");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("نصف درجة مئوية");
        strings37.add("درجة مئوية");
        strings37.add("درجة ونصف مئوية");
        strings37.add("درجتان مئوية");
        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("استنتج سبب وجود الغازات الدفيئة ؟");
        question38.setCorrect_answer("");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("غازات المصانع");
        strings38.add("عوادم وسائل النقل");
        strings38.add("الحرائق");
        strings38.add("كل ما ذكر");
        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("ما  الظاهرة التي تؤدي الى ارتفاع درجة حرارة الارض عن معدلها الطبيعي بسبب زيادة الغازات الدفيئة ؟");
        question39.setCorrect_answer("");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("تآكل طبقة الاوزون");
        strings39.add("الاحتباس الحراري");
        strings39.add("ظاهرة النينو");
        strings39.add("الامطار الحمضية");
        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("ما العوامل الطبيعية التي تساعد في حدوث ظاهرة الاحتباس الحراري ما عدا ؟");
        question40.setCorrect_answer("");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("الغازات");
        strings40.add("الابخرة");
        strings40.add("الرماد البركاني");
        strings40.add("عوادم السيارات");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("ما العوامل البشرية المسببة في حدوث ظاهرة الاحتباس الحراري ما عدا ؟");
        question41.setCorrect_answer("");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("غازات المصانع");
        strings41.add("عوادم وسائل النقل");
        strings41.add("حرائق الغابات");
        strings41.add("الرماد البركاني");
        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("جميع هذه الغازات الدفيئة تسبب ارتفاع نسبتها الى حدوث ظاهرة الاحتباس الحراري ما عدا ؟");
        question42.setCorrect_answer("");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("ثاني اكسيد الكربون و الميثان");
        strings42.add("اكاسيد النيتروجين");
        strings42.add("مركبات الكلورفلوروكربون");
        strings42.add("الاكسجين");
        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("أي من الظواهر الاتية تسمح بدخول اشعة الشمس و لا تسمح بنفاذ جزء منه ثانية الى الفضاء ؟");
        question43.setCorrect_answer("");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("الضباب");
        strings43.add("الغطاء النباتي");
        strings43.add("البيوت الزجاجية");
        strings43.add("العواصف الرملية");
        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("الاحتباس الحراري يهدد جميع دول العالم دون استثناء لأنه ظاهرة");
        question44.setCorrect_answer("");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("محلية");
        strings44.add("اقليمية");
        strings44.add("عالمية");
        strings44.add("محدودة");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("متى تم التوقيع على اتفاقية كيوتو للحد من الاحتباس الحراري ؟");
        question45.setCorrect_answer("");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("1977 م");
        strings45.add("1987 م");
        strings45.add("1997 م");
        strings45.add("2000 م");
        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("متى عقد مؤتمر مجموعة الدول الثمانية الصناعية الكبرى ؟");
        question46.setCorrect_answer("");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("2001 م");
        strings46.add("2002 م");
        strings46.add("2004 م");
        strings46.add("2005 م");
        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("من الدول التي شاركت في مؤتمر مجموعة الدول الثمانية الصناعية الكبرى سنة 2005م  ما عدا");
        question47.setCorrect_answer("");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("الولايات المتحدة و بريطانيا و المانيا");
        strings47.add("فرنسا و كندا و ايطاليا");
        strings47.add("اليابان و روسيا");
        strings47.add("الهند و باكستان");
        question47.setAnswer_list(strings47);

        Qustion question48 = new Qustion();
        question48.setName("ما الدولة التي رفضت التوقيع على اتفاق كيوتو للحد من ظاهرة الاحتباس الحراري ؟");
        question48.setCorrect_answer("");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("بريطانيا");
        strings48.add("روسيا");
        strings48.add("الولايات المتحدة الامريكية");
        strings48.add("اليابان");
        question48.setAnswer_list(strings48);

        Qustion question49 = new Qustion();
        question49.setName("كم تبلغ نسبة الغازات المسببة للاحتباس الحراري التي تسهم بها الولايات المتحدة الامريكية ؟");
        question49.setCorrect_answer("");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("15 %");
        strings49.add("25 %");
        strings49.add("35 %");
        strings49.add("45 %");
        question49.setAnswer_list(strings49);

        Qustion question50 = new Qustion();
        question50.setName("ما العقبات التي حالت دون الوصول الى اجماع دولي للحد من ظاهرة الاحتباس الحراري ؟");
        question50.setCorrect_answer("");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("رفض الولايات المتحدة الامريكية التوقيع على اتفاق كيوتو");
        strings50.add("دخول الصين و الهند و البرازيل عتبة التصنيع");
        strings50.add("عدم مشاركة الدول النامية");
        strings50.add("أ + ب");
        question50.setAnswer_list(strings50);

        Qustion question51 = new Qustion();
        question51.setName("ما المخاطر الناجمة عن ظاهرة الاحتباس الحراري ؟");
        question51.setCorrect_answer("");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("ارتفاع حرارة سطح الارض");
        strings51.add("ذوبان الجليد");
        strings51.add("ارتفاع منسوب المياه السطحية");
        strings51.add("كل ما ذكر");
        question51.setAnswer_list(strings51);

        Qustion question52 = new Qustion();
        question52.setName("ما المخاطر الناجمة عن ظاهرة الاحتباس الحراري ؟");
        question52.setCorrect_answer("");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("زيادة معدلات التبخر و حدوث الفيضانات");
        strings52.add("ظهور موجات الحر و الجفاف");
        strings52.add("حرائق الغابات و تدني الانتاج الزراعي");
        strings52.add("كل ما ذكر");
        question52.setAnswer_list(strings52);

        Qustion question53 = new Qustion();
        question53.setName("ما المخاطر الناجمة عن حدوث ظاهرة الاحتباس الحراري ؟");
        question53.setCorrect_answer("");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("تدني انتاج الثروة الحيوانية و السمكية");
        strings53.add("نقص الغذاء و انتشار المجاعات");
        strings53.add("تدني الحياة البرية");
        strings53.add("كل ما ذكر");
        question53.setAnswer_list(strings53);

        Qustion question54 = new Qustion();
        question54.setName("ما الهدف من اتفاقية كيوتو عام 1997 م ؟");
        question54.setCorrect_answer("");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("تسهيل التجارة العالمية");
        strings54.add("مكافحة الفقر");
        strings54.add("مكافحة الاحتباس الحراري");
        strings54.add("مكافحة الجريمة");
        question54.setAnswer_list(strings54);

        Qustion question55 = new Qustion();
        question55.setName("ما الهدف من عقد مؤتمر مجموعة الدول الصناعية الثمانية الكبرى عام 2005 م ؟");
        question55.setCorrect_answer("");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("مكافحة الفقر");
        strings55.add("تسهيل التجارة العالمية");
        strings55.add("مكافحة الجريمة");
        strings55.add("مكافحة الاحتباس الحراري");
        question55.setAnswer_list(strings55);

        Qustion question56 = new Qustion();
        question56.setName("ما الاجراءات التي يتم استخدامها للحد من الاحتباس الحراري على المستوى المحلي و الاقليمي و الدولي ؟");
        question56.setCorrect_answer("");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("تقليل انبعاث الغازات الدفيئة");
        strings56.add("استخدام اجهزة الفلترة و التقطير");
        strings56.add("توسيع المساحة الخضراء و نشر الوعي");
        strings56.add("كل ما ذكر");
        question56.setAnswer_list(strings56);

        Qustion question57 = new Qustion();
        question57.setName("ما هو الغاز الذي يتكون من ثلاث ذرات اكسجين و يوجد في الغلاف الجوي على شكل طبقة غاز رقيقة ؟");
        question57.setCorrect_answer("");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("الاكسجين");
        strings57.add("ثاني اكسيد الكربون");
        strings57.add("الاوزون");
        strings57.add("الفريون");
        question57.setAnswer_list(strings57);

        Qustion question58 = new Qustion();
        question58.setName("في أي من طبقات الغلاف الجوي تقع فيها طبقة الاوزون ؟");
        question58.setCorrect_answer("");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("التربوسفير");
        strings58.add("الستراتوسفير");
        strings58.add("الميزوسفير");
        strings58.add("الثيرموسفير");
        question58.setAnswer_list(strings58);

        Qustion question59 = new Qustion();
        question59.setName("ما الارتفاع الذي تحيط به طبقة الاوزون الارض ؟");
        question59.setCorrect_answer("");
        ArrayList<String> strings59 = new ArrayList<>();
        strings59.add("( 5 – 10 كم )");
        strings59.add("( 10 – 15 كم )");
        strings59.add("( 15 – 20 كم )");
        strings59.add("( 20 – 25 كم )");
        question59.setAnswer_list(strings59);

        Qustion question60 = new Qustion();
        question60.setName("ما اهمية طبقة الاوزون ؟");
        question60.setCorrect_answer("");
        ArrayList<String> strings60 = new ArrayList<>();
        strings60.add("تمنع وصول الاشعة فوق البنفسجية");
        strings60.add("تسمح بمرور الاشعة الشمسية النافعة");
        strings60.add("أ + ب");
        strings60.add("تسمح بمرور الاشعاعات الضارة");
        question60.setAnswer_list(strings60);

        Qustion question61 = new Qustion();
        question61.setName("ما الاسباب المؤدية الى تآكل طبقة الاوزون ؟");
        question61.setCorrect_answer("");
        ArrayList<String> strings61 = new ArrayList<>();
        strings61.add("الحرائق");
        strings61.add("التجارب النووية");
        strings61.add("المبيدات الحشرية");
        strings61.add("كل ما ذكر");
        question61.setAnswer_list(strings61);

        Qustion question62 = new Qustion();
        question62.setName("ما النتائج المترتبة على تآكل طبقة الاوزون ؟");
        question62.setCorrect_answer("");
        ArrayList<String> strings62 = new ArrayList<>();
        strings62.add("تغيرات مناخية كبيرة");
        strings62.add("تسرب الاشعة الضارة");
        strings62.add("اتلاف الغطاء النباتي");
        strings62.add("كل ما ذكر");
        question62.setAnswer_list(strings62);

        Qustion question63 = new Qustion();
        question63.setName("ما المركبات العضوية التي يدخل في تركيبها كل من الكلور و الفلور و الكربون ؟");
        question63.setCorrect_answer("");
        ArrayList<String> strings63 = new ArrayList<>();
        strings63.add("النيتروجين");
        strings63.add("الكلورفلوروكربون");
        strings63.add("الاكسجين");
        strings63.add("ثاني اكسيد الكربون");
        question63.setAnswer_list(strings63);

        Qustion question64 = new Qustion();
        question64.setName("ما هو التبدل في الاحوال الجوية في منطقة معينة من الارض نتيجة لتغيرات في عناصر المناخ ؟");
        question64.setCorrect_answer("");
        ArrayList<String> strings64 = new ArrayList<>();
        strings64.add("التغير المناخي");
        strings64.add("التلوث البيئي");
        strings64.add("التطرف المناخي");
        strings64.add("كل ما ذكر");
        question64.setAnswer_list(strings64);

        Qustion question65 = new Qustion();
        question65.setName("ما الاثار المترتبة على التغير المناخي ؟");
        question65.setCorrect_answer("");
        ArrayList<String> strings65 = new ArrayList<>();
        strings65.add("تناقص كميات الامطار");
        strings65.add("التصحر");
        strings65.add("حدوث الفيضانات");
        strings65.add("كل ما ذكر");
        question65.setAnswer_list(strings65);

        Qustion question66 = new Qustion();
        question66.setName("ما الاثار السلبية المترتبة على التغير المناخي ؟");
        question66.setCorrect_answer("");
        ArrayList<String> strings66 = new ArrayList<>();
        strings66.add("ذوبان الجليد");
        strings66.add("تدهور الحياة البرية");
        strings66.add("تدهور الانتاج الزراعي");
        strings66.add("كل ما ذكر");
        question66.setAnswer_list(strings66);

        Qustion question67 = new Qustion();
        question67.setName("ما العوامل الطبيعية المؤدية الى حدوث التغير المناخي ؟");
        question67.setCorrect_answer("");
        ArrayList<String> strings67 = new ArrayList<>();
        strings67.add("التغيرات التي تطرأ على الشمس");
        strings67.add("تغير ميلان محور الارض");
        strings67.add("ثوران البراكين");
        strings67.add("كل ما ذكر");
        question67.setAnswer_list(strings67);

        Qustion question68 = new Qustion();
        question68.setName("ما العوامل البشرية المؤدية الى حدوث التغير المناخي ؟");
        question68.setCorrect_answer("");
        ArrayList<String> strings68 = new ArrayList<>();
        strings68.add("غازات المصانع");
        strings68.add("غازات وسائل النقل");
        strings68.add("تدمير الغطاء النباتي");
        strings68.add("كل ما ذكر");
        question68.setAnswer_list(strings68);

        Qustion question69 = new Qustion();
        question69.setName("أي من طبقات الغلاف الجوي تعمل على حماية الارض من الاشعة الشمسية الضارة ؟");
        question69.setCorrect_answer("");
        ArrayList<String> strings69 = new ArrayList<>();
        strings69.add("التربوسفير");
        strings69.add("الاوزون");
        strings69.add("الميزوسفير");
        strings69.add("الستراتوسفير");
        question69.setAnswer_list(strings69);

        Qustion question70 = new Qustion();
        question70.setName("ضمن أي كوارث تصنف كارثة مفاعل تشرنوبل في اوكرانيا عام 1986 م ؟");
        question70.setCorrect_answer("");
        ArrayList<String> strings70 = new ArrayList<>();
        strings70.add("الطبيعية");
        strings70.add("المتعمدة");
        strings70.add("الغير متعمدة");
        strings70.add("ليس مما ذكر");
        question70.setAnswer_list(strings70);

        Qustion question71 = new Qustion();
        question71.setName("اين يوجد الثقب الذي حدث في طبقة الاوزون ؟");
        question71.setCorrect_answer("");
        ArrayList<String> strings71 = new ArrayList<>();
        strings71.add("القطب الجنوبي");
        strings71.add("القطب الشمالي");
        strings71.add("منطقة خط الاستواء");
        strings71.add("حوض البحر المتوسط");
        question71.setAnswer_list(strings71);

        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        questions.add(question48);
        questions.add(question49);
        questions.add(question50);
        questions.add(question51);
        questions.add(question52);
        questions.add(question53);
        questions.add(question54);
        questions.add(question55);
        questions.add(question56);
        questions.add(question57);
        questions.add(question58);
        questions.add(question59);
        questions.add(question60);
        questions.add(question61);
        questions.add(question62);
        questions.add(question63);
        questions.add(question64);
        questions.add(question65);
        questions.add(question69);
        questions.add(question67);
        questions.add(question68);
        questions.add(question69);
        questions.add(question70);
        questions.add(question71);
        setData(0);
        updateScore(0);

    }

    private void Question_14() {

        Qustion question20 = new Qustion();
        question20.setName("ما مفهوم تدهور و تراجع القدرة الانتاجية للأراضي الزراعية و الرعوية نتيجة لعوامل طبيعية و بشرية ؟");
        question20.setCorrect_answer("");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("التصحر");
        strings20.add("الصحراء");
        strings20.add("الواحة");
        strings20.add("الكثبان الرملية");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("أي المناطق الاكثر ارتباطا بظاهرة التصحر ؟");
        question21.setCorrect_answer("");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("الاستوائية");
        strings21.add("القطبية");
        strings21.add("الجافة و شبه الجافة");
        strings21.add("شبه القطبية");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("ضمن أي مشاكل تعد ظاهرة التصحر ؟");
        question22.setCorrect_answer("");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("محلية");
        strings22.add("عالمية");
        strings22.add("اقليمية");
        strings22.add("وطنية");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("أي من العوامل الاتية لا تعد من العوامل الطبيعية المسببة للتصحر ؟");
        question23.setCorrect_answer("");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("التغيرات المناخية");
        strings23.add("انجراف التربة و تملحها");
        strings23.add("زحف الكثبان الرملية");
        strings23.add("ضغط السكان على الاراضي الزراعية");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("أي من العوامل الاتية لا تعد من العوامل البشرية المسببة للتصحر ؟");
        question24.setCorrect_answer("");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("ضغط السكان على الاراضي الزراعية و الرعوية");
        strings24.add("ازالة الغابات للتوسع العمراني");
        strings24.add("الحروب و الصراعات و تدميرها للبيئة");
        strings24.add("انجراف التربة و تملحها");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("ما نوع التصحر الذي يستدل عليه من حدوث تلف و تدهور بسيط في الغطاء النباتي ؟");
        question25.setCorrect_answer("");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("تصحر خفيف");
        strings25.add("تصحر معتدل");
        strings25.add("تصحر شديد");
        strings25.add("تصحر شديد جدا");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("علام يدل التصحر الذي من ملامحه ظهور كثبان رملية صغيرة او تملح بسيط في التربة ؟");
        question26.setCorrect_answer("");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("خفيف");
        strings26.add("معتدل");
        strings26.add("شديد");
        strings26.add("شديد جدا");

        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("ما نوع التصحر الذي يحدث فيه تراجع ملحوظ في انتاجية الارض الزراعية و النبات الطبيعي ؟");
        question27.setCorrect_answer("");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("خفيف");
        strings27.add("معتدل");
        strings27.add("شديد");
        strings27.add("شديد جدا");
        question27.setAnswer_list(strings27);


        Qustion question28 = new Qustion();
        question28.setName("ما نسبة تراجع انتاجية الارض الزراعية و النبات الطبيعي في التصحر المعتدل ؟");
        question28.setCorrect_answer("");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("75 %");
        strings28.add("50 %");
        strings28.add("25 %");
        strings28.add("15 %");

        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("علام يدل التصحر الذي تنتشر فيه النباتات و الحشائش غير المرغوب فيها و زيادة تعرية التربة ؟");
        question29.setCorrect_answer("");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("خفيف");
        strings29.add("معتدل");
        strings29.add("شديد");
        strings29.add("شديد جدا");

        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("علام يدل تدهور انتاجية التربة لتصل الى 50 % ؟");
        question30.setCorrect_answer("");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("شديد  جدا");
        strings30.add("شديد");
        strings30.add("معتدل");
        strings30.add("خفيف");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("ما نسبة تدهور انتاجية الارض في التصحر الشديد ؟");
        question31.setCorrect_answer("");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("15 %");
        strings31.add("20 %");
        strings31.add("25 %");
        strings31.add("50 %");

        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("ما التصحر الذي دلالته ارتفاع نسبة ملوحة التربة بشكل كبير و زحف  الكثبان الرملية على الاراضي ؟");
        question32.setCorrect_answer("");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("شديد جدا");
        strings32.add("شديد");
        strings32.add("معتدل");
        strings32.add("خفيف");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("ما نوع التصحر الذي تصبح فيه الارض غير قادرة على الانتاج ؟");
        question33.setCorrect_answer("");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("خفيف");
        strings33.add("معتدل");
        strings33.add("شديد");
        strings33.add("شديد جدا");

        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("ما تداعيات التصحر على النواحي السكانية و الاقتصادية في المناطق التي تتعرض لها ما عدا ؟");
        question34.setCorrect_answer("");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("ضعف الانتاج");
        strings34.add("التهجير");
        strings34.add("سوء التغذية و المجاعات");
        strings34.add("زيادة الانتاج");

        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("ضمن أي تداعيات و اثار خطيرة تندرج زيادة نسبة الفقر و الهجرات الجماعية للسكان ؟");
        question35.setCorrect_answer("");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("اثار اجتماعية");
        strings35.add("اثار سياسية");
        strings35.add("اثار اقتصادية");
        strings35.add("اثار بيئية");

        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("ضمن أي تداعيات و اثار خطيرة تندرج النزاعات و القلاقل السياسية ؟");
        question36.setCorrect_answer("");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("اثار اجتماعية");
        strings36.add("اثار سياسية");
        strings36.add("اثار اقتصادية");
        strings36.add("اثار بيئية");

        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("ضمن تداعيات و اثار خطيرة تندرج الخسائر الاقتصادية و نقص الموارد الغذائية و الزراعية ؟");
        question37.setCorrect_answer("");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("اثار اجتماعية");
        strings37.add("اثار سياسية");
        strings37.add("اثار اقتصادية");
        strings37.add("اثار بيئية");

        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("ضمن أي تداعيات و اثار خطيرة تندرج زيادة مساحة الاراضي غير الزراعية و ارهاق ميزانيات الحكومة لتوفير الاحتياجات الغذائية ؟");
        question38.setCorrect_answer("");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("اثار اجتماعية");
        strings38.add("اثار سياسية");
        strings38.add("اثار اقتصادية");
        strings38.add("اثار بيئية");

        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("ضمن أي تداعيات و اثار خطيرة تندرج انجراف التربة و فقرها و تلوث الهواء بذرات الغبار و القضاء على الحياة البرية؟");
        question39.setCorrect_answer("");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("اثار اجتماعية");
        strings39.add("اثار سياسية");
        strings39.add("اثار اقتصادية");
        strings39.add("اثار بيئية");

        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("ما القارة الاكثر معاناة من التصحر ؟");
        question40.setCorrect_answer("");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("افريقيا");
        strings40.add("امريكا الجنوبية");
        strings40.add("اوروبا");
        strings40.add("امريكا الشمالية");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("ما الاجراءات التي من شانها الحد من ظاهرة التصحر ما عدا ؟");
        question41.setCorrect_answer("");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("القيام بمشاريع التشجير");
        strings41.add("وضع مصدات للرياح");
        strings41.add("سن القوانين و التشريعات");
        strings41.add("الزحف العمراني");

        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("ما الاجراءات التي من شانها الحد من ظاهرة التصحر ما عدا ؟");
        question42.setCorrect_answer("");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("تنظيم الرعي");
        strings42.add("استغلال الموارد المائية و صيانتها");
        strings42.add("تدهور الغطاء النباتي");
        strings42.add("نشر الوعي لمخاطر التصحر");

        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("ما الاجراءات التي من شانها الحد من ظاهرة التصحر ما عدا ؟");
        question43.setCorrect_answer("");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("استخدام صور الاقمار الصناعية");
        strings43.add("جمع المعلومات و دراستها");
        strings43.add("وضع الخطط لمكافحة التصحر");
        strings43.add("استنزاف الاراضي الزراعية المنتجة");

        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("ما هي ممارسات الاحتلال الصهيوني المؤدية الى التصحر في فلسطين ما عدا ؟");
        question44.setCorrect_answer("");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("تجريف الاراضي و الاستيطان");
        strings44.add("مصادرة الاراضي و استغلالها");
        strings44.add("ضخ مياه الصرف الصحي للأراضي الزراعية");
        strings44.add("مساعدة الفلسطينيين على استغلال الاراضي");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("ما الظروف الطبيعية التي تعاني منها فلسطين من خلال ظاهرة التصحر ؟");
        question45.setCorrect_answer("");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("نقص كمية الامطار");
        strings45.add("الضغط السكاني على الموارد الطبيعية");
        strings45.add("زيادة كمية الامطار");
        strings45.add("أ + ب ");

        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("جميع اجراءات الاحتلال الصهيوني من عوامل التصحر في فلسطين ما عدا");
        question46.setCorrect_answer("");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("الاستيطان");
        strings46.add("ضخ المياه العادمة");
        strings46.add("بناء جدار الضم");
        strings46.add("استصلاح الاراضي");

        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("ما تصنيف بركان اساما من البراكين ؟");
        question47.setCorrect_answer("");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("النشطة");
        strings47.add("الضعيفة");
        strings47.add("الهادئة");
        strings47.add("الخامدة");
        question47.setAnswer_list(strings47);
        questions.clear();
        questions.add(question20);
        questions.add(question21);
        questions.add(question22);
        questions.add(question23);
        questions.add(question24);
        questions.add(question25);
        questions.add(question26);
        questions.add(question27);
        questions.add(question28);
        questions.add(question29);
        questions.add(question30);
        questions.add(question31);
        questions.add(question32);
        questions.add(question33);
        questions.add(question34);
        questions.add(question35);
        questions.add(question36);
        questions.add(question37);
        questions.add(question38);
        questions.add(question39);
        questions.add(question40);
        questions.add(question41);
        questions.add(question42);
        questions.add(question43);
        questions.add(question44);
        questions.add(question45);
        questions.add(question46);
        questions.add(question47);
        setData(0);
        updateScore(0);

    }

    private void Question_15() {
    }

    private void Quse_all() {

        Qustion question206 = new Qustion();
        question206.setName("ما الامتداد الفلكي للمناخات الحارة الى الشمال و الجنوب من خط الاستواء ؟");
        question206.setCorrect_answer("( صفر – 30 )");
        ArrayList<String> strings206 = new ArrayList<>();
        strings206.add("( صفر – 5 )");
        strings206.add("( صفر – 10 )");
        strings206.add("( صفر – 20 )");
        strings206.add("( صفر – 30 )");
        question206.setAnswer_list(strings206);

        Qustion question207 = new Qustion();
        question207.setName("ما الامتداد الفلكي للمناخات المعتدلة الى الشمال و الجنوب من خط الاستواء ؟");
        question207.setCorrect_answer("( 30 – 60 )");
        ArrayList<String> strings207 = new ArrayList<>();
        strings207.add(" 5 – 30 )");
        strings207.add("( 30 – 45 )");
        strings207.add("( 30 – 60 )");
        strings207.add("( 45 – 60 )");
        question207.setAnswer_list(strings207);

        Qustion question208 = new Qustion();
        question208.setName("ماذا يطلق على مفهوم الفرق بين اعلى و ادنى درجة حرارة تسجل في اليوم ؟");
        question208.setCorrect_answer("المدى الحراري اليومي");
        ArrayList<String> strings208 = new ArrayList<>();
        strings208.add("لمدى الحراري السنوي");
        strings208.add("المدى الحراري الشهري");
        strings208.add("المدى الحراري اليومي");
        strings208.add("المدى الحراري العام");
        question208.setAnswer_list(strings208);

        Qustion question209 = new Qustion();
        question209.setName("ماذا يطلق على مفهوم الفرق بين اعلى و ادنى معدل حرارة لأشهر السنة ؟");
        question209.setCorrect_answer("لمدى الحراري السنوي");
        ArrayList<String> strings209 = new ArrayList<>();
        strings209.add("لمدى الحراري السنوي");
        strings209.add("المدى الحراري الشهري");
        strings209.add("المدى الحراري اليومي");
        strings209.add("المدى الحراري العام");
        question209.setAnswer_list(strings209);

        Qustion question210 = new Qustion();
        question210.setName("ما الاقليم المناخي الذي لا يعتبر ضمن الاقاليم المناخية الحارة ؟");
        question210.setCorrect_answer("اقليم البحر المتوسط");
        ArrayList<String> strings210 = new ArrayList<>();
        strings210.add("الاقليم الاستوائي");
        strings210.add("اقليم البحر المتوسط");
        strings210.add("الاقليم المداري");
        strings210.add("الاقليم الموسمي");
        question210.setAnswer_list(strings210);

        Qustion question211 = new Qustion();
        question211.setName("ما الاقليم المناخي الذي لا يعتبر ضمن الاقاليم المناخية المعتدلة ؟");
        question211.setCorrect_answer("الاقليم الاستوائي");
        ArrayList<String> strings211 = new ArrayList<>();
        strings211.add("اقليم شرق القارات");
        strings211.add(" اقليم البحر المتوسط");
        strings211.add("اقليم غرب القارات");
        strings211.add("الاقليم الاستوائي");
        question211.setAnswer_list(strings211);

        Qustion question212 = new Qustion();
        question212.setName("ما الاقليم المناخي الذي لا يعتبر ضمن الاقاليم المناخية الباردة ؟");
        question212.setCorrect_answer("اقليم غرب القارات");
        ArrayList<String> strings212 = new ArrayList<>();
        strings212.add("اقليم التندرا");
        strings212.add("الاقليم القطبي");
        strings212.add("اقليم غرب القارات");
        strings212.add("الاقليم شبه القطبي");
        question212.setAnswer_list(strings212);


        questions.clear();

        questions.add(question206);
        questions.add(question207);
        questions.add(question208);
        questions.add(question209);
        questions.add(question210);
        questions.add(question211);
        questions.add(question212);


        setData(72);

    }


}
