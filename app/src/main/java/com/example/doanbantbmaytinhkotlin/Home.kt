package com.example.doanbantbmaytinhkotlin


import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val products = listOf(
        Product("1", "RAM 16GB Corsair", 2500000, R.drawable.ram),
        Product("2", "Micro Kingston HyperX", 2000000, R.drawable.micro),
        Product("3", "Intel Core i9 14900K", 15000000, R.drawable.cpui9),
        Product("4", "RTX 4090", 61990000, R.drawable.rtx4090),
        Product("5", "Chuột Logitech G304", 1000000, R.drawable.chuot)
    )

    var selectedTab by remember { mutableStateOf(0) } // Quản lý trạng thái của Bottom Navigation

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text("Shop Linh Kiện Máy Tính") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate("Cart") },
                containerColor = Color.Blue,
                contentColor = Color.White
            ) {
                Icon(Icons.Default.ShoppingCart, contentDescription = "Cart")
            }
        },
        bottomBar = {
            BottomNavigationBar(selectedTab = selectedTab, onTabSelected = { tabIndex ->
                selectedTab = tabIndex
                when (tabIndex) {
                    0 -> navController.navigate("Home") // Chuyển hướng đến Home
                    1 -> navController.navigate("Cart") // Chuyển hướng đến Cart
                    2 -> navController.navigate("Favorites") // Chuyển hướng đến Favorites
                    3 -> navController.navigate("Account") // Chuyển hướng đến Account
                }
            })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(products) { product ->
                ProductCard(
                    product = product,
                    onClick = { navController.navigate("ProductDetail/${product.id}") }
                )
            }
        }
    }
}


