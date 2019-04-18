package com.demo.exceltorealm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.demo.exceltorealm.models.Answer;
import com.demo.exceltorealm.models.Question;
import com.demo.exceltorealm.models.SuperModel;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.this.getClass().getSimpleName();
    private TextView textView;

    private int ansCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            init();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void init() {
        findViewById();
        readExcelFile();
    }

    private void readExcelFile() {
        try{
            InputStream stream = getResources().openRawResource(R.raw.questions);
            List<SuperModel> superModelList = Poiji.fromExcel(stream, PoijiExcelType.XLS, SuperModel.class);

            doRealmTransactions(superModelList);
            for(SuperModel superModel : superModelList){
                System.out.println(superModel.getRow() + " " + superModel.getQuestion() + " " + superModel.getAns1() + " " +
                        superModel.getAns2() + " " + superModel.getAns3() + " " + superModel.getAns4() + " " + superModel.getAns5() +
                        " " + superModel.getAns6());
            }
        }catch (Exception e){
            Log.d(TAG,e.toString());
            e.printStackTrace();
        }
    }

    private void doRealmTransactions(List<SuperModel> superModelList) {
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("questions.realm")
                .schemaVersion(1)
                .build();

        Realm realm = Realm.getInstance(realmConfiguration);
        for (SuperModel superModel : superModelList){

            RealmList<Answer> answerList = new RealmList<>();
            if(superModel.getAns1() != null){
                ansCount = ansCount + 1;
                Answer answer1 = new Answer();
                answer1.setId(ansCount);
                answer1.setText(superModel.getAns1());
                if(superModel.getAns1WR() == 0){
                    answer1.setIsCorrect(false);
                }else{
                    answer1.setIsCorrect(true);
                }
                answer1.setSortIndex(100);
                answerList.add(answer1);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer1);
                realm.commitTransaction();
            }
            if(superModel.getAns2() != null){
                ansCount = ansCount + 1;
                Answer answer2 = new Answer();
                answer2.setId(ansCount);
                answer2.setText(superModel.getAns2());
                if(superModel.getAns2WR() == 0){
                    answer2.setIsCorrect(false);
                }else{
                    answer2.setIsCorrect(true);
                }
                answer2.setSortIndex(200);
                answerList.add(answer2);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer2);
                realm.commitTransaction();
            }
            if(superModel.getAns3() != null){
                ansCount = ansCount + 1;
                Answer answer3 = new Answer();
                answer3.setId(ansCount);
                answer3.setText(superModel.getAns3());
                if(superModel.getAns3WR() == 0){
                    answer3.setIsCorrect(false);
                }else{
                    answer3.setIsCorrect(true);
                }
                answer3.setSortIndex(300);
                answerList.add(answer3);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer3);
                realm.commitTransaction();
            }
            if(superModel.getAns4() != null){
                ansCount = ansCount + 1;
                Answer answer4 = new Answer();
                answer4.setId(ansCount);
                answer4.setText(superModel.getAns4());
                if(superModel.getAns4WR() == 0){
                    answer4.setIsCorrect(false);
                }else{
                    answer4.setIsCorrect(true);
                }
                answer4.setSortIndex(400);
                answerList.add(answer4);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer4);
                realm.commitTransaction();
            }
            if(superModel.getAns5() != null){
                ansCount = ansCount + 1;
                Answer answer5 = new Answer();
                answer5.setId(ansCount);
                answer5.setText(superModel.getAns5());
                if(superModel.getAns5WR() == 0){
                    answer5.setIsCorrect(false);
                }else{
                    answer5.setIsCorrect(true);
                }
                answer5.setSortIndex(500);
                answerList.add(answer5);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer5);
                realm.commitTransaction();
            }
            if(superModel.getAns6() != null){
                ansCount = ansCount + 1;
                Answer answer6 = new Answer();
                answer6.setId(ansCount);
                answer6.setText(superModel.getAns6());
                if(superModel.getAns6WR() == 0){
                    answer6.setIsCorrect(false);
                }else{
                    answer6.setIsCorrect(true);
                }
                answer6.setSortIndex(600);
                answerList.add(answer6);

                realm.beginTransaction();
                realm.copyToRealmOrUpdate(answer6);
                realm.commitTransaction();
            }
            Question q = new Question();
            q.setId(superModel.getRow());
            q.setAnswers(answerList);
            q.setHint("");
            q.setHistory(0);
            q.setText(superModel.getQuestion());
            q.setWeight(superModel.getWeight());

            realm.beginTransaction();
            realm.copyToRealmOrUpdate(q);
            realm.commitTransaction();
        }
    }

    private void readCSV() {
        InputStream inputStream = getResources().openRawResource(R.raw.demo);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                String temp = "";
                for(String string : tokens){
                    temp = temp + string;
                    Log.d(TAG,temp);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void findViewById() {
        textView = findViewById(R.id.textview);
    }

//    private void readXls() {
//        try {
//            InputStream myInput;
//            // initialize asset manager
//            AssetManager assetManager = getAssets();
//            //  open excel sheet
//            myInput = assetManager.open("demo.xls");
//            // Create a POI File System object
//            POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);
//            // Create a workbook using the File System
//            HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);
//            // Get the first sheet from workbook
//            HSSFSheet mySheet = myWorkBook.getSheetAt(0);
//            // We now need something to iterate through the cells.
//            Iterator<Row> rowIter = mySheet.rowIterator();
//            int rowno =0;
//            textView.append("\n");
//            while (rowIter.hasNext()) {
//                Log.e(TAG, " row no "+ rowno );
//                HSSFRow myRow = (HSSFRow) rowIter.next();
//                if(rowno !=0) {
//                    Iterator<Cell> cellIter = myRow.cellIterator();
//                    int colno =0;
//                    String sno="", date="", det="";
//                    while (cellIter.hasNext()) {
//                        HSSFCell myCell = (HSSFCell) cellIter.next();
//                        if (colno==0){
//                            sno = myCell.toString();
//                        }else if (colno==1){
//                            date = myCell.toString();
//                        }else if (colno==2){
//                            det = myCell.toString();
//                        }
//                        colno++;
//                        Log.e(TAG, " Index :" + myCell.getColumnIndex() + " -- " + myCell.toString());
//                    }
//                    textView.append( sno + " -- "+ date+ "  -- "+ det+"\n");
//                }
//                rowno++;
//            }
//        } catch (Exception e) {
//            Log.e(TAG, "error "+ e.toString());
//        }
//    }
}
