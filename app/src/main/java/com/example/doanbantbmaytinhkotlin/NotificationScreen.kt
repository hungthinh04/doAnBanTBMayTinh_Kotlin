package com.example.doanbantbmaytinhkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun NotificationScreen() {
    // Danh sách các thông báo mẫu
    val notifications = listOf(
        NotificationData(
            time = "19:22 24/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = true
        ),
        NotificationData(
            time = "13:24 22/11/2024",
            title = "SĂN MÃ 300K DÀNH RIÊNG CUỐI TUẦN",
            description = """
                - 1124WEEKLY300 giảm 300K cho đơn 15 triệu
                - 11WEEKEND200 giảm 200K cho đơn 10 triệu
                - 11WEEKND150 giảm 150K cho đơn 8 triệu
                - 11WEEKND100 giảm 100K cho đơn 5 triệu
                - 11WEEKND50 giảm 50K cho đơn 1 triệu 🚨
            """.trimIndent(),
            isImportant = true
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        // Thêm nhiều thông báo nếu cần
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        ),
        NotificationData(
            time = "19:13 17/11/2024",
            title = "Cơ hội cuối sử dụng mã tới 300K",
            description = "Dành riêng Thứ 6, Thứ 7, Chủ Nhật 🚨 Áp dụng toàn bộ sản phẩm, ngoại trừ hàng thanh lý, trung bày, thuê bao tại Website/App Phong Vũ 😘 Deal xịn giảm sâu, nhanh tay đặt vé!",
            isImportant = false
        )

    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        items(notifications) { notification ->
            NotificationItem(
                time = notification.time,
                title = notification.title,
                description = notification.description,
                isImportant = notification.isImportant
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun NotificationItem(time: String, title: String, description: String, isImportant: Boolean) {
    val backgroundColor = if (isImportant) Color(0xFFFFF8E1) else Color.White
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor, RoundedCornerShape(8.dp))
            .padding(12.dp)
    ) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_google), // Replace with your logo drawable
                    contentDescription = "Logo",
                    modifier = Modifier.size(32.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                BasicText(
                    text = time,
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            BasicText(
                text = title,
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            )
            Spacer(modifier = Modifier.height(4.dp))
            BasicText(
                text = description,
                style = TextStyle(fontSize = 14.sp, color = Color.Black)
            )
        }
    }
}

