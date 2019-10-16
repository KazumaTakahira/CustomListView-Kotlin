package com.example.customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataList: MutableList<MutableMap<String, String>> = mutableListOf()
        var data = mutableMapOf(
            "title" to "JavaScript",
            "tag" to "dynamic",
            "desc" to "console.log(\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Python",
            "tag" to "dynamic",
            "desc" to "print(\"Hello, World!\")"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Java",
            "tag" to "static",
            "desc" to "System.out.println(\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "C/CPP",
            "tag" to "static",
            "desc" to "printf(\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "PHP",
            "tag" to "dynamic",
            "desc" to "echo \"Hello, World!\""
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Swift",
            "tag" to "static",
            "desc" to "print(\"Hello, World!\")"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "kotlin",
            "tag" to "static",
            "desc" to "plintln(\"Hello, World!\")"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "C#",
            "tag" to "static",
            "desc" to "System.Console.WriteLine(\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Ruby",
            "tag" to "dynamic",
            "desc" to "puts \"Hello, World!\";"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Haskell",
            "tag" to "static",
            "desc" to "main = putStrLn \"Hello, World!\""
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Objective-C",
            "tag" to "static",
            "desc" to "NSLog(@\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Go",
            "tag" to "static",
            "desc" to "fmt.Println(\"Hello, World!\")"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Rust",
            "tag" to "static",
            "desc" to "println!(\"Hello, World!\");"
        )
        dataList.add(data)
        data = mutableMapOf(
            "title" to "Elm",
            "tag" to "static",
            "desc" to "main = text \"Hello, World!\""
        )
        dataList.add(data)

        val simpleAdapter = SimpleAdapter(
            this,
            dataList,
            R.layout.item_list,
            arrayOf("title", "tag", "desc"),
            intArrayOf(R.id.title, R.id.tag, R.id.desc)
        )
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = simpleAdapter
    }
}
