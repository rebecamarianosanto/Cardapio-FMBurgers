<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@drawable/bgg"
        tools:context=".MainActivity">


<RelativeLayout
        android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@color/my_primary"
                android:alpha="0.1"/>

<LinearLayout
        android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="28dp">

<TextureView
            android:layout_width="wrap_content"
                    android:layout_height="wrap_content"/>


</LinearLayout>

<androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        app:cardCornerRadius="28dp"
        android:layout_marginBottom="-20dp"
        >

<LinearLayout
            android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="28dp">

<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Dados de entrega"
                        android:textColor="@color/my_primary"
                        android:textSize="32sp"
                        android:textStyle="bold"/>

<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Preencha o seu endereço:"
                        android:alpha="0.7"/>

<View
                android:layout_width="wrap_content"
                        android:layout_height="15dp"/>
<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Cep:"
                        android:textStyle="bold"
                        android:alpha="0.7"/>

<EditText
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="number"></EditText>

<View
                android:layout_width="wrap_content"
                        android:layout_height="15dp"/>
<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Endereço:"
                        android:textStyle="bold"
                        android:alpha="0.7"/>

<EditText
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="text"></EditText>

<View
                android:layout_width="wrap_content"
                        android:layout_height="15dp"/>
<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Número:"
                        android:textStyle="bold"
                        android:alpha="0.7"/>

<EditText
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="number"></EditText>

<View
                android:layout_width="wrap_content"
                        android:layout_height="15dp"/>
<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Bloco:"
                        android:textStyle="bold"
                        android:alpha="0.7"/>

<EditText
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="text"></EditText>

<View
                android:layout_width="wrap_content"
                        android:layout_height="15dp"/>
<TextView
                android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Complemento:"
                        android:textStyle="bold"
                        android:alpha="0.7"/>

<EditText
                android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="text"></EditText>

<View
                android:layout_width="wrap_content"
                        android:layout_height="10dp"/>

<com.google.android.material.button.MaterialButton
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:onClick="MainActivity2"
        android:text="Confirmar Dados"
        app:cornerRadius="32dp"
        tools:ignore="OnClick,UsingOnClickInXml" />

<View
                android:layout_width="wrap_content"
                        android:layout_height="10dp"/>





</LinearLayout>


</androidx.cardview.widget.CardView>

</RelativeLayout>