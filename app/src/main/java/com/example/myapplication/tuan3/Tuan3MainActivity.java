package com.example.myapplication.tuan3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.R;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

// Tuan3MainActivity.java
// Tuan3MainActivity.java
public class Tuan3MainActivity extends AppCompatActivity {

    // User class
    public static class User {
        private String username;
        private String phoneNumber;

        public User(String username, String phoneNumber) {
            this.username = username;
            this.phoneNumber = phoneNumber;
        }

        public String getUsername() {
            return username;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

    // UserAdapter class
    public class UserAdapter extends ArrayAdapter<User> {
        public UserAdapter(Context context, List<User> users) {
            super(context, 0, users);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_user, parent, false);
            }

            User user = getItem(position);

            TextView textViewUsername = convertView.findViewById(R.id.textViewUsername);
            TextView textViewPhoneNumber = convertView.findViewById(R.id.textViewPhoneNumber);

            if (user != null) {
                textViewUsername.setText("Username: " + user.getUsername());
                textViewPhoneNumber.setText("Phone Number: " + user.getPhoneNumber());
            }

            return convertView;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);

        // Danh sách người dùng
        List<User> users = new ArrayList<>();
        users.add(new User("User1", "1234567890"));
        users.add(new User("User2", "9876543210"));
        // Thêm các người dùng khác nếu cần

        // Tạo Adapter và liên kết Adapter với ListView
        UserAdapter userAdapter = new UserAdapter(this, users);
        ListView listViewUsers = findViewById(R.id.listViewUsers);
        listViewUsers.setAdapter(userAdapter);
    }
}

