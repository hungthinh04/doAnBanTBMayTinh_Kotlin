package com.example.doanbantbmaytinhkotlin


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue


@Composable
fun RegisterScreen() {
    var TaiKhoan by remember { mutableStateOf("") }
    var matkhau by remember { mutableStateOf("") }
    var nhaplai by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Đăng Ký", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = TaiKhoan,
            onValueChange = {TaiKhoan=it},
            label = { Text("Tài khoản") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(

            value = matkhau,
            onValueChange = {matkhau=it},
            label = { Text("Mật khẩu") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = nhaplai,
            onValueChange = {nhaplai=it},
            label = { Text("Nhập lại mật khẩu") },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button (onClick = {}) {
            Text(text = "Đăng Ký")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Hoặc đăng ký bằng")

        Row(modifier = Modifier
            .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = {},
                modifier = Modifier.size(32.dp)
                    .background(color = Color.Blue)
            ) {
//                Image(painter = painterResource(id = R.drawable.ic_facebook),
//                    contentDescription = "Facebook")
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = {},
                modifier = Modifier.size(32.dp)
                    .background(color = Color.Red)
            ) {
//                Image(painter = painterResource(id = R.drawable.ic_google),
//                    contentDescription = "Google"
//                )
            }
        }
    }
}