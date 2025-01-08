package com.example.doanbantbmaytinhkotlin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Support
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AccountOptionItem(
    icon: ImageVector,
    label: String,
    onClick: () -> Unit
) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(24.dp),
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = label,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
        )
    }
}

@Composable
fun AccountScreen(navController: NavHostController) {
    Scaffold(

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5F5))
                .padding(paddingValues)
        ) {
            // Nút Đăng ký / Đăng nhập
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { navController.navigate("Login") },
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Đăng ký / Đăng nhập", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Danh sách mục với sự kiện
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    AccountOptionItem(
                        icon = Icons.Default.AccountCircle,
                        label = "Giới thiệu bạn bè",
                        onClick = {
                            // Xử lý khi nhấn nút Giới thiệu bạn bè
                            navController.navigate("ReferFriend") // Điều hướng tới màn hình Giới thiệu bạn bè
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Star,
                        label = "Lịch sử điểm thành viên",
                        onClick = {
                            // Xử lý khi nhấn nút Lịch sử điểm thành viên
                            navController.navigate("MemberPoints") // Điều hướng tới màn hình Lịch sử điểm
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Menu,
                        label = "Quản lý đơn hàng",
                        onClick = {
                            // Xử lý khi nhấn nút Quản lý đơn hàng
                            navController.navigate("OrderManagement") // Điều hướng tới màn hình Quản lý đơn hàng
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Language,
                        label = "Thay đổi ngôn ngữ",
                        onClick = {
                            // Xử lý khi nhấn nút Thay đổi ngôn ngữ
                            navController.navigate("ChangeLanguage") // Điều hướng tới màn hình Thay đổi ngôn ngữ
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Favorite,
                        label = "Khuyến mãi Hot",
                        onClick = {
                            // Xử lý khi nhấn nút Khuyến mãi Hot
                            navController.navigate("HotPromotions") // Điều hướng tới màn hình Khuyến mãi Hot
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Support,
                        label = "Hỗ trợ 0932412321",
                        onClick = {
                            // Xử lý khi nhấn nút Hỗ trợ
                            // Thực hiện hành động như gọi điện
                        }
                    )
                }
                item {
                    AccountOptionItem(
                        icon = Icons.Default.Shield,
                        label = "Chính sách và điều khoản",
                        onClick = {
                            // Xử lý khi nhấn nút Chính sách và điều khoản
                            navController.navigate("Policy") // Điều hướng tới màn hình Chính sách
                        }
                    )
                }
            }
        }
    }
}
