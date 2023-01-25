package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.salem.myapp.adapter.QuestionAdapter;
import com.salem.myapp.modle.Qustion;

import java.util.ArrayList;
import java.util.Locale;

public class question2 extends AppCompatActivity {
    ArrayList<Qustion> questions = new ArrayList<>();
    QuestionAdapter questionAdapter;
    TextView butn_next;
    RecyclerView rvQuestion;
    int current = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rvQuestion = findViewById(R.id.rvQuestion);
        butn_next = findViewById(R.id.butn_next);
        textView = findViewById(R.id.textView);



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
        question19.setName("");
        question19.setCorrect_answer("");
        ArrayList<String> strings19 = new ArrayList<>();
        strings19.add("");
        strings19.add("");
        strings19.add("");
        strings19.add("");
        question19.setAnswer_list(strings19);


        Qustion question20 = new Qustion();
        question20.setName("");
        question20.setCorrect_answer("");
        ArrayList<String> strings20 = new ArrayList<>();
        strings20.add("");
        strings20.add("");
        strings20.add("");
        strings20.add("");
        question20.setAnswer_list(strings20);

        Qustion question21 = new Qustion();
        question21.setName("");
        question21.setCorrect_answer("");
        ArrayList<String> strings21 = new ArrayList<>();
        strings21.add("");
        strings21.add("");
        strings21.add("");
        strings21.add("");
        question21.setAnswer_list(strings21);

        Qustion question22 = new Qustion();
        question22.setName("");
        question22.setCorrect_answer("");
        ArrayList<String> strings22 = new ArrayList<>();
        strings22.add("");
        strings22.add("");
        strings22.add("");
        strings22.add("");
        question22.setAnswer_list(strings22);

        Qustion question23 = new Qustion();
        question23.setName("");
        question23.setCorrect_answer("");
        ArrayList<String> strings23 = new ArrayList<>();
        strings23.add("");
        strings23.add(" ");
        strings23.add("");
        strings23.add("");
        question23.setAnswer_list(strings23);

        Qustion question24 = new Qustion();
        question24.setName("");
        question24.setCorrect_answer("");
        ArrayList<String> strings24 = new ArrayList<>();
        strings24.add("");
        strings24.add("");
        strings24.add("");
        strings24.add("");
        question24.setAnswer_list(strings24);

        Qustion question25 = new Qustion();
        question25.setName("");
        question25.setCorrect_answer("");
        ArrayList<String> strings25 = new ArrayList<>();
        strings25.add("");
        strings25.add("");
        strings25.add("");
        strings25.add("");
        question25.setAnswer_list(strings25);

        Qustion question26 = new Qustion();
        question26.setName("");
        question26.setCorrect_answer("");
        ArrayList<String> strings26 = new ArrayList<>();
        strings26.add("");
        strings26.add("");
        strings26.add("");
        strings26.add("");

        question26.setAnswer_list(strings26);

        Qustion question27 = new Qustion();
        question27.setName("");
        question27.setCorrect_answer("");
        ArrayList<String> strings27 = new ArrayList<>();
        strings27.add("");
        strings27.add("");
        strings27.add("");
        strings27.add("");
        question27.setAnswer_list(strings27);


        Qustion question28 = new Qustion();
        question28.setName("");
        question28.setCorrect_answer("");
        ArrayList<String> strings28 = new ArrayList<>();
        strings28.add("");
        strings28.add("");
        strings28.add("");
        strings28.add("");

        question28.setAnswer_list(strings28);

        Qustion question29 = new Qustion();
        question29.setName("");
        question29.setCorrect_answer("");
        ArrayList<String> strings29 = new ArrayList<>();
        strings29.add("");
        strings29.add("");
        strings29.add("");
        strings29.add("");

        question29.setAnswer_list(strings29);

        Qustion question30 = new Qustion();
        question30.setName("");
        question30.setCorrect_answer("");
        ArrayList<String> strings30 = new ArrayList<>();
        strings30.add("");
        strings30.add("");
        strings30.add("");
        strings30.add("");
        question30.setAnswer_list(strings30);

        Qustion question31 = new Qustion();
        question31.setName("");
        question31.setCorrect_answer("");
        ArrayList<String> strings31 = new ArrayList<>();
        strings31.add("");
        strings31.add("");
        strings31.add("");
        strings31.add("");

        question31.setAnswer_list(strings31);

        Qustion question32 = new Qustion();
        question32.setName("");
        question32.setCorrect_answer("");
        ArrayList<String> strings32 = new ArrayList<>();
        strings32.add("");
        strings32.add("");
        strings32.add("");
        strings32.add("");
        question32.setAnswer_list(strings32);

        Qustion question33 = new Qustion();
        question33.setName("");
        question33.setCorrect_answer("");
        ArrayList<String> strings33 = new ArrayList<>();
        strings33.add("");
        strings33.add("");
        strings33.add("");
        strings33.add("");

        question33.setAnswer_list(strings33);

        Qustion question34 = new Qustion();
        question34.setName("");
        question34.setCorrect_answer("");
        ArrayList<String> strings34 = new ArrayList<>();
        strings34.add("");
        strings34.add("");
        strings34.add("");
        strings34.add("");

        question34.setAnswer_list(strings34);

        Qustion question35 = new Qustion();
        question35.setName("");
        question35.setCorrect_answer("");
        ArrayList<String> strings35 = new ArrayList<>();
        strings35.add("");
        strings35.add("");
        strings35.add("");
        strings35.add("");

        question35.setAnswer_list(strings35);

        Qustion question36 = new Qustion();
        question36.setName("");
        question36.setCorrect_answer("");
        ArrayList<String> strings36 = new ArrayList<>();
        strings36.add("");
        strings36.add("");
        strings36.add("");
        strings36.add("");

        question36.setAnswer_list(strings36);

        Qustion question37 = new Qustion();
        question37.setName("");
        question37.setCorrect_answer("");
        ArrayList<String> strings37 = new ArrayList<>();
        strings37.add("");
        strings37.add("");
        strings37.add("");
        strings37.add("");

        question37.setAnswer_list(strings37);

        Qustion question38 = new Qustion();
        question38.setName("");
        question38.setCorrect_answer("");
        ArrayList<String> strings38 = new ArrayList<>();
        strings38.add("");
        strings38.add("");
        strings38.add("");
        strings38.add("");

        question38.setAnswer_list(strings38);

        Qustion question39 = new Qustion();
        question39.setName("");
        question39.setCorrect_answer("");
        ArrayList<String> strings39 = new ArrayList<>();
        strings39.add("");
        strings39.add("");
        strings39.add("");
        strings39.add("");

        question39.setAnswer_list(strings39);

        Qustion question40 = new Qustion();
        question40.setName("");
        question40.setCorrect_answer("");
        ArrayList<String> strings40 = new ArrayList<>();
        strings40.add("");
        strings40.add("");
        strings40.add("");
        strings40.add("");
        question40.setAnswer_list(strings40);

        Qustion question41 = new Qustion();
        question41.setName("");
        question41.setCorrect_answer("");
        ArrayList<String> strings41 = new ArrayList<>();
        strings41.add("");
        strings41.add("");
        strings41.add("");
        strings41.add("");

        question41.setAnswer_list(strings41);

        Qustion question42 = new Qustion();
        question42.setName("");
        question42.setCorrect_answer("");
        ArrayList<String> strings42 = new ArrayList<>();
        strings42.add("");
        strings42.add("");
        strings42.add("");
        strings42.add("");

        question42.setAnswer_list(strings42);

        Qustion question43 = new Qustion();
        question43.setName("");
        question43.setCorrect_answer("");
        ArrayList<String> strings43 = new ArrayList<>();
        strings43.add("");
        strings43.add("");
        strings43.add("");
        strings43.add("");

        question43.setAnswer_list(strings43);

        Qustion question44 = new Qustion();
        question44.setName("");
        question44.setCorrect_answer("");
        ArrayList<String> strings44 = new ArrayList<>();
        strings44.add("");
        strings44.add("");
        strings44.add("");
        strings44.add("");
        question44.setAnswer_list(strings44);

        Qustion question45 = new Qustion();
        question45.setName("");
        question45.setCorrect_answer("");
        ArrayList<String> strings45 = new ArrayList<>();
        strings45.add("");
        strings45.add("");
        strings45.add("");
        strings45.add("");

        question45.setAnswer_list(strings45);

        Qustion question46 = new Qustion();
        question46.setName("");
        question46.setCorrect_answer("");
        ArrayList<String> strings46 = new ArrayList<>();
        strings46.add("");
        strings46.add("");
        strings46.add("");
        strings46.add("");

        question46.setAnswer_list(strings46);

        Qustion question47 = new Qustion();
        question47.setName("");
        question47.setCorrect_answer("");
        ArrayList<String> strings47 = new ArrayList<>();
        strings47.add("");
        strings47.add("");
        strings47.add("");
        strings47.add("");

        question47.setAnswer_list(strings47);

        Qustion question48 = new Qustion();
        question48.setName("");
        question48.setCorrect_answer("");
        ArrayList<String> strings48 = new ArrayList<>();
        strings48.add("");
        strings48.add("");
        strings48.add("");
        strings48.add("");

        question48.setAnswer_list(strings48);

        Qustion question49 = new Qustion();
        question49.setName("");
        question49.setCorrect_answer("");
        ArrayList<String> strings49 = new ArrayList<>();
        strings49.add("");
        strings49.add("");
        strings49.add("");
        strings49.add("");
        question49.setAnswer_list(strings49);

        Qustion question50 = new Qustion();
        question50.setName("");
        question50.setCorrect_answer("");
        ArrayList<String> strings50 = new ArrayList<>();
        strings50.add("");
        strings50.add("");
        strings50.add("");
        strings50.add("");

        question50.setAnswer_list(strings50);

        Qustion question51 = new Qustion();
        question51.setName("");
        question51.setCorrect_answer("");
        ArrayList<String> strings51 = new ArrayList<>();
        strings51.add("");
        strings51.add("");
        strings51.add("");
        strings51.add("");

        question51.setAnswer_list(strings51);

        Qustion question52 = new Qustion();
        question52.setName("");
        question52.setCorrect_answer("");
        ArrayList<String> strings52 = new ArrayList<>();
        strings52.add("");
        strings52.add("");
        strings52.add("");
        strings52.add("");

        question52.setAnswer_list(strings52);

        Qustion question53 = new Qustion();
        question53.setName("");
        question53.setCorrect_answer("");
        ArrayList<String> strings53 = new ArrayList<>();
        strings53.add("");
        strings53.add("");
        strings53.add("");
        strings53.add("");

        question53.setAnswer_list(strings53);

        Qustion question54 = new Qustion();
        question54.setName("");
        question54.setCorrect_answer("");
        ArrayList<String> strings54 = new ArrayList<>();
        strings54.add("");
        strings54.add("");
        strings54.add("");
        strings54.add("");

        question54.setAnswer_list(strings54);

        Qustion question55 = new Qustion();
        question55.setName("");
        question55.setCorrect_answer("");
        ArrayList<String> strings55 = new ArrayList<>();
        strings55.add("");
        strings55.add("");
        strings55.add("");
        strings55.add("");

        question55.setAnswer_list(strings55);

        Qustion question56 = new Qustion();
        question56.setName("");
        question56.setCorrect_answer("");
        ArrayList<String> strings56 = new ArrayList<>();
        strings56.add("");
        strings56.add("");
        strings56.add("");
        strings56.add("");

        question56.setAnswer_list(strings56);

        Qustion question57 = new Qustion();
        question57.setName("");
        question57.setCorrect_answer("");
        ArrayList<String> strings57 = new ArrayList<>();
        strings57.add("");
        strings57.add("");
        strings57.add("");
        strings57.add("");

        question57.setAnswer_list(strings57);

        Qustion question58 = new Qustion();
        question58.setName("");
        question58.setCorrect_answer("");
        ArrayList<String> strings58 = new ArrayList<>();
        strings58.add("");
        strings58.add("");
        strings58.add("");
        strings58.add("");

        question58.setAnswer_list(strings58);

        Qustion question59 = new Qustion();
        question59.setName("");
        question59.setCorrect_answer("");
        ArrayList<String> strings59 = new ArrayList<>();
        strings59.add("");
        strings59.add("");
        strings59.add("");
        strings59.add("");

        question59.setAnswer_list(strings59);

        Qustion question60 = new Qustion();
        question60.setName("");
        question60.setCorrect_answer("");
        ArrayList<String> strings60 = new ArrayList<>();
        strings60.add("");
        strings60.add("");
        strings60.add("");
        strings60.add("");

        question60.setAnswer_list(strings60);

        Qustion question61 = new Qustion();
        question61.setName("");
        question61.setCorrect_answer("");
        ArrayList<String> strings61 = new ArrayList<>();
        strings61.add("");
        strings61.add("");
        strings61.add("");
        strings61.add("");

        question61.setAnswer_list(strings61);

        Qustion question62 = new Qustion();
        question62.setName("");
        question62.setCorrect_answer("");
        ArrayList<String> strings62 = new ArrayList<>();
        strings62.add("");
        strings62.add("");
        strings62.add("");
        strings62.add("");

        question62.setAnswer_list(strings62);

        Qustion question63 = new Qustion();
        question63.setName("");
        question63.setCorrect_answer("");
        ArrayList<String> strings63 = new ArrayList<>();
        strings63.add("");
        strings63.add("");
        strings63.add("");
        strings63.add("");

        question63.setAnswer_list(strings63);

        Qustion question64 = new Qustion();
        question64.setName("");
        question64.setCorrect_answer("");
        ArrayList<String> strings64 = new ArrayList<>();
        strings64.add("");
        strings64.add("");
        strings64.add("");
        strings64.add("");

        question64.setAnswer_list(strings64);

        Qustion question65 = new Qustion();
        question65.setName("");
        question65.setCorrect_answer("");
        ArrayList<String> strings65 = new ArrayList<>();
        strings65.add("");
        strings65.add("");
        strings65.add("");
        strings65.add("");

        question65.setAnswer_list(strings65);

        Qustion question66 = new Qustion();
        question66.setName("");
        question66.setCorrect_answer("");
        ArrayList<String> strings66 = new ArrayList<>();
        strings66.add("");
        strings66.add("");
        strings66.add("");
        strings66.add("");

        question66.setAnswer_list(strings66);

        Qustion question67 = new Qustion();
        question67.setName("");
        question67.setCorrect_answer("");
        ArrayList<String> strings67 = new ArrayList<>();
        strings67.add("");
        strings67.add("");
        strings67.add("");
        strings67.add("");

        question67.setAnswer_list(strings67);

        Qustion question68 = new Qustion();
        question68.setName("");
        question68.setCorrect_answer("");
        ArrayList<String> strings68 = new ArrayList<>();
        strings68.add("");
        strings68.add("");
        strings68.add("");
        strings68.add("");

        question68.setAnswer_list(strings68);

        Qustion question69 = new Qustion();
        question69.setName("");
        question69.setCorrect_answer("");
        ArrayList<String> strings69 = new ArrayList<>();
        strings69.add("");
        strings69.add("");
        strings69.add("");
        strings69.add("");

        question69.setAnswer_list(strings69);

        Qustion question70 = new Qustion();
        question70.setName("");
        question70.setCorrect_answer("");
        ArrayList<String> strings70 = new ArrayList<>();
        strings70.add("");
        strings70.add("");
        strings70.add("");
        strings70.add("");

        question70.setAnswer_list(strings70);

        Qustion question71 = new Qustion();
        question71.setName("");
        question71.setCorrect_answer("");
        ArrayList<String> strings71 = new ArrayList<>();
        strings71.add("");
        strings71.add("");
        strings71.add("");
        strings71.add("");

        question71.setAnswer_list(strings71);

        Qustion question72 = new Qustion();
        question72.setName("");
        question72.setCorrect_answer("");
        ArrayList<String> strings72 = new ArrayList<>();
        strings72.add("");
        strings72.add("");
        strings72.add("");
        strings72.add("");

        question72.setAnswer_list(strings72);

        Qustion question73 = new Qustion();
        question73.setName("");
        question73.setCorrect_answer("");
        ArrayList<String> strings73 = new ArrayList<>();
        strings73.add("");
        strings73.add("");
        strings73.add("");
        strings73.add("");

        question73.setAnswer_list(strings73);

        Qustion question74 = new Qustion();
        question74.setName("");
        question74.setCorrect_answer("");
        ArrayList<String> strings74 = new ArrayList<>();
        strings74.add("");
        strings74.add("");
        strings74.add("");
        strings74.add("");

        question74.setAnswer_list(strings74);

        Qustion question75 = new Qustion();
        question75.setName("");
        question75.setCorrect_answer("");
        ArrayList<String> strings75 = new ArrayList<>();
        strings75.add("");
        strings75.add("");
        strings75.add("");
        strings75.add("");

        question75.setAnswer_list(strings75);

        Qustion question76 = new Qustion();
        question76.setName("");
        question76.setCorrect_answer("");
        ArrayList<String> strings76 = new ArrayList<>();
        strings76.add("");
        strings76.add("");
        strings76.add("");
        strings76.add("");

        question76.setAnswer_list(strings76);

        Qustion question77 = new Qustion();
        question77.setName("");
        question77.setCorrect_answer("");
        ArrayList<String> strings77 = new ArrayList<>();
        strings77.add("");
        strings77.add("");
        strings77.add("");
        strings77.add("");

        question77.setAnswer_list(strings77);

        Qustion question78 = new Qustion();
        question78.setName("");
        question78.setCorrect_answer("");
        ArrayList<String> strings78 = new ArrayList<>();
        strings78.add("");
        strings78.add("");
        strings78.add("");
        strings78.add("");

        question78.setAnswer_list(strings78);

        Qustion question79 = new Qustion();
        question79.setName("");
        question79.setCorrect_answer("");
        ArrayList<String> strings79 = new ArrayList<>();
        strings79.add("");
        strings79.add("");
        strings79.add("");
        strings79.add("");

        question79.setAnswer_list(strings79);

        Qustion question80 = new Qustion();
        question80.setName("");
        question80.setCorrect_answer("");
        ArrayList<String> strings80 = new ArrayList<>();
        strings80.add("");
        strings80.add("");
        strings80.add("");
        strings80.add("");

        question80.setAnswer_list(strings80);

        Qustion question81 = new Qustion();
        question81.setName("");
        question81.setCorrect_answer("");
        ArrayList<String> strings81 = new ArrayList<>();
        strings81.add("");
        strings81.add("");
        strings81.add("");
        strings81.add("");

        question81.setAnswer_list(strings81);

        Qustion question82 = new Qustion();
        question82.setName("");
        question82.setCorrect_answer("");
        ArrayList<String> strings82 = new ArrayList<>();
        strings82.add("");
        strings82.add("");
        strings82.add("");
        strings82.add("");

        question82.setAnswer_list(strings82);

        Qustion question83 = new Qustion();
        question83.setName("");
        question83.setCorrect_answer("");
        ArrayList<String> strings83 = new ArrayList<>();
        strings83.add("");
        strings83.add("");
        strings83.add("");
        strings83.add("");

        question83.setAnswer_list(strings83);

        Qustion question84 = new Qustion();
        question84.setName("");
        question84.setCorrect_answer("");
        ArrayList<String> strings84 = new ArrayList<>();
        strings84.add("");
        strings84.add("");
        strings84.add("");
        strings84.add("");

        question84.setAnswer_list(strings84);

        Qustion question85 = new Qustion();
        question85.setName("");
        question85.setCorrect_answer("");
        ArrayList<String> strings85 = new ArrayList<>();
        strings85.add("");
        strings85.add("");
        strings85.add("");
        strings85.add("");

        question85.setAnswer_list(strings85);

        Qustion question86 = new Qustion();
        question86.setName("");
        question86.setCorrect_answer("");
        ArrayList<String> strings86 = new ArrayList<>();
        strings86.add("");
        strings86.add("");
        strings86.add("");
        strings86.add("");

        question86.setAnswer_list(strings86);

        Qustion question87 = new Qustion();
        question87.setName("");
        question87.setCorrect_answer("");
        ArrayList<String> strings87 = new ArrayList<>();
        strings87.add("");
        strings87.add("");
        strings87.add("");
        strings87.add("");

        question87.setAnswer_list(strings87);

        Qustion question88 = new Qustion();
        question88.setName("");
        question88.setCorrect_answer("");
        ArrayList<String> strings88 = new ArrayList<>();
        strings88.add("");
        strings88.add("");
        strings88.add("");
        strings88.add("");

        question88.setAnswer_list(strings88);

        Qustion question89 = new Qustion();
        question89.setName("");
        question89.setCorrect_answer("");
        ArrayList<String> strings89 = new ArrayList<>();
        strings89.add("");
        strings89.add("");
        strings89.add("");
        strings89.add("");

        question89.setAnswer_list(strings89);

        Qustion question90 = new Qustion();
        question90.setName("");
        question90.setCorrect_answer("");
        ArrayList<String> strings90 = new ArrayList<>();
        strings90.add("");
        strings90.add("");
        strings90.add("");
        strings90.add("");

        question90.setAnswer_list(strings90);

        Qustion question91 = new Qustion();
        question91.setName("");
        question91.setCorrect_answer("");
        ArrayList<String> strings91 = new ArrayList<>();
        strings91.add("");
        strings91.add("");
        strings91.add("");
        strings91.add("");

        question91.setAnswer_list(strings91);

        Qustion question92 = new Qustion();
        question92.setName("");
        question92.setCorrect_answer("");
        ArrayList<String> strings92 = new ArrayList<>();
        strings92.add("");
        strings92.add("");
        strings92.add("");
        strings92.add("");

        question92.setAnswer_list(strings92);

        Qustion question93 = new Qustion();
        question93.setName("");
        question93.setCorrect_answer("");
        ArrayList<String> strings93 = new ArrayList<>();
        strings93.add("");
        strings93.add("");
        strings93.add("");
        strings93.add("");

        question93.setAnswer_list(strings93);

        Qustion question94 = new Qustion();
        question94.setName("");
        question94.setCorrect_answer("");
        ArrayList<String> strings94 = new ArrayList<>();
        strings94.add("");
        strings94.add("");
        strings94.add("");
        strings94.add("");

        question94.setAnswer_list(strings94);

        Qustion question95 = new Qustion();
        question95.setName("");
        question95.setCorrect_answer("");
        ArrayList<String> strings95 = new ArrayList<>();
        strings95.add("");
        strings95.add("");
        strings95.add("");
        strings95.add("");

        question95.setAnswer_list(strings95);

        Qustion question96 = new Qustion();
        question96.setName("");
        question96.setCorrect_answer("");
        ArrayList<String> strings96 = new ArrayList<>();
        strings96.add("");
        strings96.add("");
        strings96.add("");
        strings96.add("");

        question96.setAnswer_list(strings96);

        Qustion question97 = new Qustion();
        question97.setName("");
        question97.setCorrect_answer("");
        ArrayList<String> strings97 = new ArrayList<>();
        strings97.add("");
        strings97.add("");
        strings97.add("");
        strings97.add("");

        question97.setAnswer_list(strings97);

        Qustion question98 = new Qustion();
        question98.setName("");
        question98.setCorrect_answer("");
        ArrayList<String> strings98 = new ArrayList<>();
        strings98.add("");
        strings98.add("");
        strings98.add("");
        strings98.add("");

        question98.setAnswer_list(strings98);

        Qustion question99 = new Qustion();
        question99.setName("");
        question99.setCorrect_answer("");
        ArrayList<String> strings99 = new ArrayList<>();
        strings99.add("");
        strings99.add("");
        strings99.add("");
        strings99.add("");

        question99.setAnswer_list(strings99);

        Qustion question100 = new Qustion();
        question100.setName("");
        question100.setCorrect_answer("");
        ArrayList<String> strings100 = new ArrayList<>();
        strings100.add("");
        strings100.add("");
        strings100.add("");
        strings100.add("");

        question100.setAnswer_list(strings100);

        Qustion question101 = new Qustion();
        question101.setName("");
        question101.setCorrect_answer("");
        ArrayList<String> strings101 = new ArrayList<>();
        strings101.add("");
        strings101.add("");
        strings101.add("");
        strings101.add("");

        question101.setAnswer_list(strings101);

        Qustion question102 = new Qustion();
        question102.setName("");
        question102.setCorrect_answer("");
        ArrayList<String> strings102 = new ArrayList<>();
        strings102.add("");
        strings102.add("");
        strings102.add("");
        strings102.add("");

        question102.setAnswer_list(strings102);

        Qustion question103 = new Qustion();
        question103.setName("");
        question103.setCorrect_answer("");
        ArrayList<String> strings103 = new ArrayList<>();
        strings103.add("");
        strings103.add("");
        strings103.add("");
        strings103.add("");

        question103.setAnswer_list(strings103);

        Qustion question104 = new Qustion();
        question104.setName("");
        question104.setCorrect_answer("");
        ArrayList<String> strings104 = new ArrayList<>();
        strings104.add("");
        strings104.add("");
        strings104.add("");
        strings104.add("");

        question104.setAnswer_list(strings104);

        Qustion question105 = new Qustion();
        question105.setName("");
        question105.setCorrect_answer("");
        ArrayList<String> strings105 = new ArrayList<>();
        strings105.add("");
        strings105.add("");
        strings105.add("");
        strings105.add("");

        question105.setAnswer_list(strings105);

        Qustion question106 = new Qustion();
        question106.setName("");
        question106.setCorrect_answer("");
        ArrayList<String> strings106 = new ArrayList<>();
        strings106.add("");
        strings106.add("");
        strings106.add("");
        strings106.add("");

        question106.setAnswer_list(strings106);

        Qustion question107 = new Qustion();
        question107.setName("");
        question107.setCorrect_answer("");
        ArrayList<String> strings107 = new ArrayList<>();
        strings107.add("");
        strings107.add("");
        strings107.add("");
        strings107.add("");

        question107.setAnswer_list(strings107);

        Qustion question108 = new Qustion();
        question108.setName("");
        question108.setCorrect_answer("");
        ArrayList<String> strings108 = new ArrayList<>();
        strings108.add("");
        strings108.add("");
        strings108.add("");
        strings108.add("");

        question108.setAnswer_list(strings108);

        Qustion question109 = new Qustion();
        question109.setName("");
        question109.setCorrect_answer("");
        ArrayList<String> strings109 = new ArrayList<>();
        strings109.add("");
        strings109.add("");
        strings109.add("");
        strings109.add("");

        question109.setAnswer_list(strings109);

        Qustion question110 = new Qustion();
        question110.setName("");
        question110.setCorrect_answer("");
        ArrayList<String> strings110 = new ArrayList<>();
        strings110.add("");
        strings110.add("");
        strings110.add("");
        strings110.add("");

        question110.setAnswer_list(strings110);

        Qustion question111 = new Qustion();
        question111.setName("");
        question111.setCorrect_answer("");
        ArrayList<String> strings111 = new ArrayList<>();
        strings111.add("");
        strings111.add("");
        strings111.add("");
        strings111.add("");

        question111.setAnswer_list(strings111);

        Qustion question112 = new Qustion();
        question112.setName("");
        question112.setCorrect_answer("");
        ArrayList<String> strings112 = new ArrayList<>();
        strings112.add("");
        strings112.add("");
        strings112.add("");
        strings112.add("");

        question112.setAnswer_list(strings112);

        Qustion question113 = new Qustion();
        question113.setName("");
        question113.setCorrect_answer("");
        ArrayList<String> strings113 = new ArrayList<>();
        strings113.add("");
        strings113.add("");
        strings113.add("");
        strings113.add("");

        question113.setAnswer_list(strings113);

        Qustion question114 = new Qustion();
        question114.setName("");
        question114.setCorrect_answer("");
        ArrayList<String> strings114 = new ArrayList<>();
        strings114.add("");
        strings114.add("");
        strings114.add("");
        strings114.add("");

        question114.setAnswer_list(strings114);

        Qustion question115 = new Qustion();
        question115.setName("");
        question115.setCorrect_answer("");
        ArrayList<String> strings115 = new ArrayList<>();
        strings115.add("");
        strings115.add("");
        strings115.add("");
        strings115.add("");

        question115.setAnswer_list(strings115);

        Qustion question116 = new Qustion();
        question116.setName("");
        question116.setCorrect_answer("");
        ArrayList<String> strings116 = new ArrayList<>();
        strings116.add("");
        strings116.add("");
        strings116.add("");
        strings116.add("");

        question116.setAnswer_list(strings116);

        Qustion question117 = new Qustion();
        question117.setName("");
        question117.setCorrect_answer("");
        ArrayList<String> strings117 = new ArrayList<>();
        strings117.add("");
        strings117.add("");
        strings117.add("");
        strings117.add("");

        question117.setAnswer_list(strings117);

        Qustion question118 = new Qustion();
        question118.setName("");
        question118.setCorrect_answer("");
        ArrayList<String> strings118 = new ArrayList<>();
        strings118.add("");
        strings118.add("");
        strings118.add("");
        strings118.add("");

        question118.setAnswer_list(strings118);

        Qustion question119 = new Qustion();
        question119.setName("");
        question119.setCorrect_answer("");
        ArrayList<String> strings119 = new ArrayList<>();
        strings119.add("");
        strings119.add("");
        strings119.add("");
        strings119.add("");

        question119.setAnswer_list(strings119);

        Qustion question120 = new Qustion();
        question120.setName("");
        question120.setCorrect_answer("");
        ArrayList<String> strings120 = new ArrayList<>();
        strings120.add("");
        strings120.add("");
        strings120.add("");
        strings120.add("");

        question120.setAnswer_list(strings120);

        Qustion question121 = new Qustion();
        question121.setName("");
        question121.setCorrect_answer("");
        ArrayList<String> strings121 = new ArrayList<>();
        strings121.add("");
        strings121.add("");
        strings121.add("");
        strings121.add("");

        question121.setAnswer_list(strings121);

        Qustion question122 = new Qustion();
        question122.setName("");
        question122.setCorrect_answer("");
        ArrayList<String> strings122 = new ArrayList<>();
        strings122.add("");
        strings122.add("");
        strings122.add("");
        strings122.add("");

        question122.setAnswer_list(strings122);

        Qustion question123 = new Qustion();
        question123.setName("");
        question123.setCorrect_answer("");
        ArrayList<String> strings123 = new ArrayList<>();
        strings123.add("");
        strings123.add("");
        strings123.add("");
        strings123.add("");

        question123.setAnswer_list(strings123);

        Qustion question124 = new Qustion();
        question124.setName("");
        question124.setCorrect_answer("");
        ArrayList<String> strings124 = new ArrayList<>();
        strings124.add("");
        strings124.add("");
        strings124.add("");
        strings124.add("");

        question124.setAnswer_list(strings124);

        Qustion question125 = new Qustion();
        question125.setName("");
        question125.setCorrect_answer("");
        ArrayList<String> strings125 = new ArrayList<>();
        strings125.add("");
        strings125.add("");
        strings125.add("");
        strings125.add("");

        question125.setAnswer_list(strings125);

        Qustion question126 = new Qustion();
        question126.setName("");
        question126.setCorrect_answer("");
        ArrayList<String> strings126 = new ArrayList<>();
        strings126.add("");
        strings126.add("");
        strings126.add("");
        strings126.add("");

        question126.setAnswer_list(strings126);

        Qustion question127 = new Qustion();
        question127.setName("");
        question127.setCorrect_answer("");
        ArrayList<String> strings127 = new ArrayList<>();
        strings127.add("");
        strings127.add("");
        strings127.add("");
        strings127.add("");

        question127.setAnswer_list(strings127);

        Qustion question128 = new Qustion();
        question128.setName("");
        question128.setCorrect_answer("");
        ArrayList<String> strings128 = new ArrayList<>();
        strings128.add("");
        strings128.add("");
        strings128.add("");
        strings128.add("");

        question128.setAnswer_list(strings128);

        Qustion question129 = new Qustion();
        question129.setName("");
        question129.setCorrect_answer("");
        ArrayList<String> strings129 = new ArrayList<>();
        strings129.add("");
        strings129.add("");
        strings129.add("");
        strings129.add("");

        question129.setAnswer_list(strings129);

        Qustion question130 = new Qustion();
        question130.setName("");
        question130.setCorrect_answer("");
        ArrayList<String> strings130 = new ArrayList<>();
        strings130.add("");
        strings130.add("");
        strings130.add("");
        strings130.add("");

        question130.setAnswer_list(strings130);

        Qustion question131 = new Qustion();
        question131.setName("");
        question131.setCorrect_answer("");
        ArrayList<String> strings131 = new ArrayList<>();
        strings131.add("");
        strings131.add("");
        strings131.add("");
        strings131.add("");

        question131.setAnswer_list(strings131);

        Qustion question132 = new Qustion();
        question132.setName("");
        question132.setCorrect_answer("");
        ArrayList<String> strings132 = new ArrayList<>();
        strings132.add("");
        strings132.add("");
        strings132.add("");
        strings132.add("");

        question132.setAnswer_list(strings132);

        Qustion question133 = new Qustion();
        question133.setName("");
        question133.setCorrect_answer("");
        ArrayList<String> strings133 = new ArrayList<>();
        strings133.add("");
        strings133.add("");
        strings133.add("");
        strings133.add("");

        question133.setAnswer_list(strings133);

        Qustion question134 = new Qustion();
        question134.setName("");
        question134.setCorrect_answer("");
        ArrayList<String> strings134 = new ArrayList<>();
        strings134.add("");
        strings134.add("");
        strings134.add("");
        strings134.add("");

        question134.setAnswer_list(strings134);

        Qustion question135 = new Qustion();
        question135.setName("");
        question135.setCorrect_answer("");
        ArrayList<String> strings135 = new ArrayList<>();
        strings135.add("");
        strings135.add("");
        strings135.add("");
        strings135.add("");

        question135.setAnswer_list(strings135);

        Qustion question136 = new Qustion();
        question136.setName("");
        question136.setCorrect_answer("");
        ArrayList<String> strings136 = new ArrayList<>();
        strings136.add("");
        strings136.add("");
        strings136.add("");
        strings136.add("");

        question136.setAnswer_list(strings136);

        Qustion question137 = new Qustion();
        question137.setName("");
        question137.setCorrect_answer("");
        ArrayList<String> strings137 = new ArrayList<>();
        strings137.add("");
        strings137.add("");
        strings137.add("");
        strings137.add("");

        question137.setAnswer_list(strings137);

        Qustion question138 = new Qustion();
        question138.setName("");
        question138.setCorrect_answer("");
        ArrayList<String> strings138 = new ArrayList<>();
        strings138.add("");
        strings138.add("");
        strings138.add("");
        strings138.add("");

        question138.setAnswer_list(strings138);

        Qustion question139 = new Qustion();
        question139.setName("");
        question139.setCorrect_answer("");
        ArrayList<String> strings139 = new ArrayList<>();
        strings139.add("");
        strings139.add("");
        strings139.add("");
        strings139.add("");

        question139.setAnswer_list(strings139);

        Qustion question140 = new Qustion();
        question140.setName("");
        question140.setCorrect_answer("");
        ArrayList<String> strings140 = new ArrayList<>();
        strings140.add("");
        strings140.add("");
        strings140.add("");
        strings140.add("");

        question140.setAnswer_list(strings140);

        Qustion question141 = new Qustion();
        question141.setName("");
        question141.setCorrect_answer("");
        ArrayList<String> strings141 = new ArrayList<>();
        strings141.add("");
        strings141.add("");
        strings141.add("");
        strings141.add("");

        question141.setAnswer_list(strings141);

        Qustion question142 = new Qustion();
        question142.setName("");
        question142.setCorrect_answer("");
        ArrayList<String> strings142 = new ArrayList<>();
        strings142.add("");
        strings142.add("");
        strings142.add("");
        strings142.add("");

        question142.setAnswer_list(strings142);

        Qustion question143 = new Qustion();
        question143.setName("");
        question143.setCorrect_answer("");
        ArrayList<String> strings143 = new ArrayList<>();
        strings143.add("");
        strings143.add("");
        strings143.add("");
        strings143.add("");

        question143.setAnswer_list(strings143);

        Qustion question144 = new Qustion();
        question144.setName("");
        question144.setCorrect_answer("");
        ArrayList<String> strings144 = new ArrayList<>();
        strings144.add("");
        strings144.add("");
        strings144.add("");
        strings144.add("");

        question144.setAnswer_list(strings144);

        Qustion question145 = new Qustion();
        question145.setName("");
        question145.setCorrect_answer("");
        ArrayList<String> strings145 = new ArrayList<>();
        strings145.add("");
        strings145.add("");
        strings145.add("");
        strings145.add("");

        question145.setAnswer_list(strings145);

        Qustion question146 = new Qustion();
        question146.setName("");
        question146.setCorrect_answer("");
        ArrayList<String> strings146 = new ArrayList<>();
        strings146.add("");
        strings146.add("");
        strings146.add("");
        strings146.add("");

        question146.setAnswer_list(strings146);

        Qustion question147 = new Qustion();
        question147.setName("");
        question147.setCorrect_answer("");
        ArrayList<String> strings147 = new ArrayList<>();
        strings147.add("");
        strings147.add("");
        strings147.add("");
        strings147.add("");

        question147.setAnswer_list(strings147);

        Qustion question148 = new Qustion();
        question148.setName("");
        question148.setCorrect_answer("");
        ArrayList<String> strings148 = new ArrayList<>();
        strings148.add("");
        strings148.add("");
        strings148.add("");
        strings148.add("");

        question148.setAnswer_list(strings148);

        Qustion question149 = new Qustion();
        question149.setName("");
        question149.setCorrect_answer("");
        ArrayList<String> strings149 = new ArrayList<>();
        strings149.add("");
        strings149.add("");
        strings149.add("");
        strings149.add("");

        question149.setAnswer_list(strings149);

        Qustion question150 = new Qustion();
        question150.setName("");
        question150.setCorrect_answer("");
        ArrayList<String> strings150 = new ArrayList<>();
        strings150.add("");
        strings150.add("");
        strings150.add("");
        strings150.add("");

        question150.setAnswer_list(strings150);

        Qustion question151 = new Qustion();
        question151.setName("");
        question151.setCorrect_answer("");
        ArrayList<String> strings151 = new ArrayList<>();
        strings151.add("");
        strings151.add("");
        strings151.add("");
        strings151.add("");

        question151.setAnswer_list(strings151);

        Qustion question152 = new Qustion();
        question152.setName("");
        question152.setCorrect_answer("");
        ArrayList<String> strings152 = new ArrayList<>();
        strings152.add("");
        strings152.add("");
        strings152.add("");
        strings152.add("");

        question152.setAnswer_list(strings152);

        Qustion question153 = new Qustion();
        question153.setName("");
        question153.setCorrect_answer("");
        ArrayList<String> strings153 = new ArrayList<>();
        strings153.add("");
        strings153.add("");
        strings153.add("");
        strings153.add("");

        question153.setAnswer_list(strings153);

        Qustion question154 = new Qustion();
        question154.setName("");
        question154.setCorrect_answer("");
        ArrayList<String> strings154 = new ArrayList<>();
        strings154.add("");
        strings154.add("");
        strings154.add("");
        strings154.add("");

        question154.setAnswer_list(strings154);

        Qustion question155 = new Qustion();
        question155.setName("");
        question155.setCorrect_answer("");
        ArrayList<String> strings155 = new ArrayList<>();
        strings155.add("");
        strings155.add("");
        strings155.add("");
        strings155.add("");

        question155.setAnswer_list(strings155);

        Qustion question156 = new Qustion();
        question156.setName("");
        question156.setCorrect_answer("");
        ArrayList<String> strings156 = new ArrayList<>();
        strings156.add("");
        strings156.add("");
        strings156.add("");
        strings156.add("");

        question156.setAnswer_list(strings156);

        Qustion question157 = new Qustion();
        question157.setName("");
        question157.setCorrect_answer("");
        ArrayList<String> strings157 = new ArrayList<>();
        strings157.add("");
        strings157.add("");
        strings157.add("");
        strings157.add("");

        question157.setAnswer_list(strings157);

        Qustion question158 = new Qustion();
        question158.setName("");
        question158.setCorrect_answer("");
        ArrayList<String> strings158 = new ArrayList<>();
        strings158.add("");
        strings158.add("");
        strings158.add("");
        strings158.add("");

        question158.setAnswer_list(strings158);

        Qustion question159 = new Qustion();
        question159.setName("");
        question159.setCorrect_answer("");
        ArrayList<String> strings159 = new ArrayList<>();
        strings159.add("");
        strings159.add("");
        strings159.add("");
        strings159.add("");

        question159.setAnswer_list(strings159);

        Qustion question160 = new Qustion();
        question160.setName("");
        question160.setCorrect_answer("");
        ArrayList<String> strings160 = new ArrayList<>();
        strings160.add("");
        strings160.add("");
        strings160.add("");
        strings160.add("");

        question160.setAnswer_list(strings160);

        Qustion question161 = new Qustion();
        question161.setName("");
        question161.setCorrect_answer("");
        ArrayList<String> strings161 = new ArrayList<>();
        strings161.add("");
        strings161.add("");
        strings161.add("");
        strings161.add("");

        question161.setAnswer_list(strings161);

        Qustion question162 = new Qustion();
        question162.setName("");
        question162.setCorrect_answer("");
        ArrayList<String> strings162 = new ArrayList<>();
        strings162.add("");
        strings162.add("");
        strings162.add("");
        strings162.add("");

        question162.setAnswer_list(strings162);

        Qustion question163 = new Qustion();
        question163.setName("");
        question163.setCorrect_answer("");
        ArrayList<String> strings163 = new ArrayList<>();
        strings163.add("");
        strings163.add("");
        strings163.add("");
        strings163.add("");

        question163.setAnswer_list(strings163);

        Qustion question164 = new Qustion();
        question164.setName("");
        question164.setCorrect_answer("");
        ArrayList<String> strings164 = new ArrayList<>();
        strings164.add("");
        strings164.add("");
        strings164.add("");
        strings164.add("");

        question164.setAnswer_list(strings164);

        Qustion question165 = new Qustion();
        question165.setName("");
        question165.setCorrect_answer("");
        ArrayList<String> strings165 = new ArrayList<>();
        strings165.add("");
        strings165.add("");
        strings165.add("");
        strings165.add("");

        question165.setAnswer_list(strings165);

        Qustion question166 = new Qustion();
        question166.setName("");
        question166.setCorrect_answer("");
        ArrayList<String> strings166 = new ArrayList<>();
        strings166.add("");
        strings166.add("");
        strings166.add("");
        strings166.add("");

        question166.setAnswer_list(strings166);

        Qustion question167 = new Qustion();
        question167.setName("");
        question167.setCorrect_answer("");
        ArrayList<String> strings167 = new ArrayList<>();
        strings167.add("");
        strings167.add("");
        strings167.add("");
        strings167.add("");

        question167.setAnswer_list(strings167);

        Qustion question168 = new Qustion();
        question168.setName("");
        question168.setCorrect_answer("");
        ArrayList<String> strings168 = new ArrayList<>();
        strings168.add("");
        strings168.add("");
        strings168.add("");
        strings168.add("");

        question168.setAnswer_list(strings168);

        Qustion question169 = new Qustion();
        question169.setName("");
        question169.setCorrect_answer("");
        ArrayList<String> strings169 = new ArrayList<>();
        strings169.add("");
        strings169.add("");
        strings169.add("");
        strings169.add("");

        question169.setAnswer_list(strings169);

        Qustion question170 = new Qustion();
        question170.setName("");
        question170.setCorrect_answer("");
        ArrayList<String> strings170 = new ArrayList<>();
        strings170.add("");
        strings170.add("");
        strings170.add("");
        strings170.add("");

        question170.setAnswer_list(strings170);

        Qustion question171 = new Qustion();
        question171.setName("");
        question171.setCorrect_answer("");
        ArrayList<String> strings171 = new ArrayList<>();
        strings171.add("");
        strings171.add("");
        strings171.add("");
        strings171.add("");

        question171.setAnswer_list(strings171);

        Qustion question172 = new Qustion();
        question172.setName("");
        question172.setCorrect_answer("");
        ArrayList<String> strings172 = new ArrayList<>();
        strings172.add("");
        strings172.add("");
        strings172.add("");
        strings172.add("");

        question172.setAnswer_list(strings172);

        Qustion question173 = new Qustion();
        question173.setName("");
        question173.setCorrect_answer("");
        ArrayList<String> strings173 = new ArrayList<>();
        strings173.add("");
        strings173.add("");
        strings173.add("");
        strings173.add("");

        question173.setAnswer_list(strings173);

        Qustion question174 = new Qustion();
        question174.setName("");
        question174.setCorrect_answer("");
        ArrayList<String> strings174 = new ArrayList<>();
        strings174.add("");
        strings174.add("");
        strings174.add("");
        strings174.add("");

        question174.setAnswer_list(strings174);

        Qustion question175 = new Qustion();
        question175.setName("");
        question175.setCorrect_answer("");
        ArrayList<String> strings175 = new ArrayList<>();
        strings175.add("");
        strings175.add("");
        strings175.add("");
        strings175.add("");

        question175.setAnswer_list(strings175);

        Qustion question176 = new Qustion();
        question176.setName("");
        question176.setCorrect_answer("");
        ArrayList<String> strings176 = new ArrayList<>();
        strings176.add("");
        strings176.add("");
        strings176.add("");
        strings176.add("");

        question176.setAnswer_list(strings176);

        Qustion question177 = new Qustion();
        question177.setName("");
        question177.setCorrect_answer("");
        ArrayList<String> strings177 = new ArrayList<>();
        strings177.add("");
        strings177.add("");
        strings177.add("");
        strings177.add("");

        question177.setAnswer_list(strings177);

        Qustion question178 = new Qustion();
        question178.setName("");
        question178.setCorrect_answer("");
        ArrayList<String> strings178 = new ArrayList<>();
        strings178.add("");
        strings178.add("");
        strings178.add("");
        strings178.add("");

        question178.setAnswer_list(strings178);

        Qustion question179 = new Qustion();
        question179.setName("");
        question179.setCorrect_answer("");
        ArrayList<String> strings179 = new ArrayList<>();
        strings179.add("");
        strings179.add("");
        strings179.add("");
        strings179.add("");

        question179.setAnswer_list(strings179);

        Qustion question180 = new Qustion();
        question180.setName("");
        question180.setCorrect_answer("");
        ArrayList<String> strings180 = new ArrayList<>();
        strings180.add("");
        strings180.add("");
        strings180.add("");
        strings180.add("");

        question180.setAnswer_list(strings180);

        Qustion question181 = new Qustion();
        question181.setName("");
        question181.setCorrect_answer("");
        ArrayList<String> strings181 = new ArrayList<>();
        strings181.add("");
        strings181.add("");
        strings181.add("");
        strings181.add("");

        question181.setAnswer_list(strings181);

        Qustion question182 = new Qustion();
        question182.setName("");
        question182.setCorrect_answer("");
        ArrayList<String> strings182 = new ArrayList<>();
        strings182.add("");
        strings182.add("");
        strings182.add("");
        strings182.add("");

        question182.setAnswer_list(strings182);

        Qustion question183 = new Qustion();
        question183.setName("");
        question183.setCorrect_answer("");
        ArrayList<String> strings183 = new ArrayList<>();
        strings183.add("");
        strings183.add("");
        strings183.add("");
        strings183.add("");

        question183.setAnswer_list(strings183);

        Qustion question184 = new Qustion();
        question184.setName("");
        question184.setCorrect_answer("");
        ArrayList<String> strings184 = new ArrayList<>();
        strings184.add("");
        strings184.add("");
        strings184.add("");
        strings184.add("");

        question184.setAnswer_list(strings184);

        Qustion question185 = new Qustion();
        question185.setName("");
        question185.setCorrect_answer("");
        ArrayList<String> strings185 = new ArrayList<>();
        strings185.add("");
        strings185.add("");
        strings185.add("");
        strings185.add("");

        question185.setAnswer_list(strings185);

        Qustion question186 = new Qustion();
        question186.setName("");
        question186.setCorrect_answer("");
        ArrayList<String> strings186 = new ArrayList<>();
        strings186.add("");
        strings186.add("");
        strings186.add("");
        strings186.add("");

        question186.setAnswer_list(strings186);

        Qustion question187 = new Qustion();
        question187.setName("");
        question187.setCorrect_answer("");
        ArrayList<String> strings187 = new ArrayList<>();
        strings187.add("");
        strings187.add("");
        strings187.add("");
        strings187.add("");

        question187.setAnswer_list(strings187);

        Qustion question188 = new Qustion();
        question188.setName("");
        question188.setCorrect_answer("");
        ArrayList<String> strings188 = new ArrayList<>();
        strings188.add("");
        strings188.add("");
        strings188.add("");
        strings188.add("");

        question188.setAnswer_list(strings188);

        Qustion question189 = new Qustion();
        question189.setName("");
        question189.setCorrect_answer("");
        ArrayList<String> strings189 = new ArrayList<>();
        strings189.add("");
        strings189.add("");
        strings189.add("");
        strings189.add("");

        question189.setAnswer_list(strings189);

        Qustion question190 = new Qustion();
        question190.setName("");
        question190.setCorrect_answer("");
        ArrayList<String> strings190 = new ArrayList<>();
        strings190.add("");
        strings190.add("");
        strings190.add("");
        strings190.add("");

        question190.setAnswer_list(strings190);

        Qustion question191 = new Qustion();
        question191.setName("");
        question191.setCorrect_answer("");
        ArrayList<String> strings191 = new ArrayList<>();
        strings191.add("");
        strings191.add("");
        strings191.add("");
        strings191.add("");

        question191.setAnswer_list(strings191);

        Qustion question192 = new Qustion();
        question192.setName("");
        question192.setCorrect_answer("");
        ArrayList<String> strings192 = new ArrayList<>();
        strings192.add("");
        strings192.add("");
        strings192.add("");
        strings192.add("");

        question192.setAnswer_list(strings192);

        Qustion question193 = new Qustion();
        question193.setName("");
        question193.setCorrect_answer("");
        ArrayList<String> strings193 = new ArrayList<>();
        strings193.add("");
        strings193.add("");
        strings193.add("");
        strings193.add("");

        question193.setAnswer_list(strings193);

        Qustion question194 = new Qustion();
        question194.setName("");
        question194.setCorrect_answer("");
        ArrayList<String> strings194 = new ArrayList<>();
        strings194.add("");
        strings194.add("");
        strings194.add("");
        strings194.add("");

        question194.setAnswer_list(strings194);

        Qustion question195 = new Qustion();
        question195.setName("");
        question195.setCorrect_answer("");
        ArrayList<String> strings195 = new ArrayList<>();
        strings195.add("");
        strings195.add("");
        strings195.add("");
        strings195.add("");

        question195.setAnswer_list(strings195);

        Qustion question196 = new Qustion();
        question196.setName("");
        question196.setCorrect_answer("");
        ArrayList<String> strings196 = new ArrayList<>();
        strings196.add("");
        strings196.add("");
        strings196.add("");
        strings196.add("");

        question196.setAnswer_list(strings196);

        Qustion question197 = new Qustion();
        question197.setName("");
        question197.setCorrect_answer("");
        ArrayList<String> strings197 = new ArrayList<>();
        strings197.add("");
        strings197.add("");
        strings197.add("");
        strings197.add("");

        question197.setAnswer_list(strings197);

        Qustion question198 = new Qustion();
        question198.setName("");
        question198.setCorrect_answer("");
        ArrayList<String> strings198 = new ArrayList<>();
        strings198.add("");
        strings198.add("");
        strings198.add("");
        strings198.add("");

        question198.setAnswer_list(strings198);

        Qustion question199 = new Qustion();
        question199.setName("");
        question199.setCorrect_answer("");
        ArrayList<String> strings199 = new ArrayList<>();
        strings199.add("");
        strings199.add("");
        strings199.add("");
        strings199.add("");

        question199.setAnswer_list(strings199);

        Qustion question200 = new Qustion();
        question200.setName("");
        question200.setCorrect_answer("");
        ArrayList<String> strings200 = new ArrayList<>();
        strings200.add("");
        strings200.add("");
        strings200.add("");
        strings200.add("");

        question200.setAnswer_list(strings200);

        Qustion question201 = new Qustion();
        question201.setName("");
        question201.setCorrect_answer("");
        ArrayList<String> strings201 = new ArrayList<>();
        strings201.add("");
        strings201.add("");
        strings201.add("");
        strings201.add("");

        question201.setAnswer_list(strings201);

        Qustion question202 = new Qustion();
        question202.setName("");
        question202.setCorrect_answer("");
        ArrayList<String> strings202 = new ArrayList<>();
        strings202.add("");
        strings202.add("");
        strings202.add("");
        strings202.add("");

        question202.setAnswer_list(strings202);

        Qustion question203 = new Qustion();
        question203.setName("");
        question203.setCorrect_answer("");
        ArrayList<String> strings203 = new ArrayList<>();
        strings203.add("");
        strings203.add("");
        strings203.add("");
        strings203.add("");

        question203.setAnswer_list(strings203);

        Qustion question204 = new Qustion();
        question204.setName("");
        question204.setCorrect_answer("");
        ArrayList<String> strings204 = new ArrayList<>();
        strings204.add("");
        strings204.add("");
        strings204.add("");
        strings204.add("");

        question204.setAnswer_list(strings204);

        Qustion question205 = new Qustion();
        question205.setName("");
        question205.setCorrect_answer("");
        ArrayList<String> strings205 = new ArrayList<>();
        strings205.add("");
        strings205.add("");
        strings205.add("");
        strings205.add("");

        question205.setAnswer_list(strings205);

        Qustion question206 = new Qustion();
        question206.setName("");
        question206.setCorrect_answer("");
        ArrayList<String> strings206 = new ArrayList<>();
        strings206.add("");
        strings206.add("");
        strings206.add("");
        strings206.add("");

        question206.setAnswer_list(strings206);

        Qustion question207 = new Qustion();
        question207.setName("");
        question207.setCorrect_answer("");
        ArrayList<String> strings207 = new ArrayList<>();
        strings207.add("");
        strings207.add("");
        strings207.add("");
        strings207.add("");

        question207.setAnswer_list(strings207);

        Qustion question208 = new Qustion();
        question208.setName("");
        question208.setCorrect_answer("");
        ArrayList<String> strings208 = new ArrayList<>();
        strings208.add("");
        strings208.add("");
        strings208.add("");
        strings208.add("");

        question208.setAnswer_list(strings208);

        Qustion question209 = new Qustion();
        question209.setName("");
        question209.setCorrect_answer("");
        ArrayList<String> strings209 = new ArrayList<>();
        strings209.add("");
        strings209.add("");
        strings209.add("");
        strings209.add("");

        question209.setAnswer_list(strings209);

        Qustion question210 = new Qustion();
        question210.setName("");
        question210.setCorrect_answer("");
        ArrayList<String> strings210 = new ArrayList<>();
        strings210.add("");
        strings210.add("");
        strings210.add("");
        strings210.add("");

        question210.setAnswer_list(strings210);

        Qustion question211 = new Qustion();
        question211.setName("");
        question211.setCorrect_answer("");
        ArrayList<String> strings211 = new ArrayList<>();
        strings211.add("");
        strings211.add("");
        strings211.add("");
        strings211.add("");

        question211.setAnswer_list(strings211);

        Qustion question212 = new Qustion();
        question212.setName("");
        question212.setCorrect_answer("");
        ArrayList<String> strings212 = new ArrayList<>();
        strings212.add("");
        strings212.add("");
        strings212.add("");
        strings212.add("");

        question212.setAnswer_list(strings212);


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
        butn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((current - 1) < questions.size()) {
                    current++;
                    setData(current);
                }
            }
        });


    }

    private void setData(int current) {
        questionAdapter = new QuestionAdapter(questions.get(current));
        rvQuestion.setLayoutManager(new LinearLayoutManager(question2.this));
        rvQuestion.setAdapter(questionAdapter);
    }

}