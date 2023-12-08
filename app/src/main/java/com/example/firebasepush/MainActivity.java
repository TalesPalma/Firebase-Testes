package com.example.firebasepush;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.FragmentManager;

import com.example.firebasepush.Fragments.CadastroFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SharedPreferences sharedPreferences = this.getSharedPreferences("Verificar", MODE_PRIVATE);
        Boolean verificar = sharedPreferences.getBoolean("PrimeiraVez", true);


        if (verificar == true) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragmentContainerView3,
                            CadastroFragment.class, null)
                    .setReorderingAllowed(true).addToBackStack("nada")
                    .commit();

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("PrimeiraVez", false);
            editor.apply();
            notificationTools(this,"Bem vindo!!","Registre-se para a melhor experiencia da sua vida");

        }
        notificationTools(this,"Bem vindo!!","Quê bom ver você aqui denovo");


    }

    private void notificationTools(Context context, String title, String body) {

        NotificationChannel channel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            channel = new NotificationChannel("MeuCanal", "Canal Tales", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = context.getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Notification.Builder builder = new Notification.Builder(context, "MeuCanal")
                    .setSmallIcon(com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark_focused)
                    .setContentTitle(title)
                    .setContentText(body);

            NotificationManagerCompat compat = NotificationManagerCompat.from(context);

            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            }

            compat.notify(123, builder.build());

        }

    }


}