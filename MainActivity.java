package com.example.a24270.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfruits();//初始化水果数据
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManage=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManage);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }
    private void initfruits(){
        for (int i=0;i<2;i++)
        {
            /*Fruit m1=new Fruit(getRandomLengthName("木两两"),R.drawable.mll2);
            fruitList.add(m1);
            Fruit m2=new Fruit(getRandomLengthName("木两两大傻逼"),R.drawable.mll2);
            fruitList.add(m2);
            Fruit m3=new Fruit(getRandomLengthName("来自石柱的木两两"),R.drawable.mll2);
            fruitList.add(m3);
            Fruit m4=new Fruit(getRandomLengthName("化材大佬木两两"),R.drawable.mll2);
            fruitList.add(m4);
            Fruit m5=new Fruit(getRandomLengthName("SBMLL"),R.drawable.mll2);
            fruitList.add(m5);
            Fruit m6=new Fruit(getRandomLengthName("英语大佬木两两"),R.drawable.mll2);
            fruitList.add(m6);
            Fruit m7=new Fruit(getRandomLengthName("木老克"),R.drawable.mll2);
            fruitList.add(m7);
            Fruit m8=new Fruit(getRandomLengthName("超级大剩女木两两"),R.drawable.mll2);
            fruitList.add(m8);*/
            Fruit m1=new Fruit(getRandomLengthName("Apple"),R.drawable.fruit);
            fruitList.add(m1);
            Fruit m2=new Fruit(getRandomLengthName("Banana"),R.drawable.fruit);
            fruitList.add(m2);
            Fruit m3=new Fruit(getRandomLengthName("Orange"),R.drawable.fruit);
            fruitList.add(m3);
            Fruit m4=new Fruit(getRandomLengthName("Watermelon"),R.drawable.fruit);
            fruitList.add(m4);
            Fruit m5=new Fruit(getRandomLengthName("Pear"),R.drawable.fruit);
            fruitList.add(m5);
            Fruit m6=new Fruit(getRandomLengthName("Grape"),R.drawable.fruit);
            fruitList.add(m6);
            Fruit m7=new Fruit(getRandomLengthName("Pineapple"),R.drawable.fruit);
            fruitList.add(m7);
            Fruit m8=new Fruit(getRandomLengthName("Strawberry"),R.drawable.fruit);
            fruitList.add(m8);
        }
    }
    private String getRandomLengthName(String name){
        Random random=new Random();
        int length =random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
