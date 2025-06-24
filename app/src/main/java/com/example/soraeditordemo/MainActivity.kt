package com.example.soraeditordemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.rosemoe.sora.widget.CodeEditor
import io.github.rosemoe.sora.langs.java.JavaLanguage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editor = findViewById<CodeEditor>(R.id.editor)
        editor.setEditorLanguage(JavaLanguage())
        editor.setText(
            """
            public class HelloWorld {
                public static void main(String[] args) {
                    System.out.println("Hello, Kamil!");
                }
            }
            """.trimIndent()
        )
    }
}