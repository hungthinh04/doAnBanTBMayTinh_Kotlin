package com.example.doanbantbmaytinhkotlin


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doanbantbmaytinhkotlin.HomeScreen

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") { HomeScreen(navController) }
        composable("Cart") { CartScreen(navController) }
        composable("Favorites") { FavoritesScreen(navController) }
        composable("Account") { AccountScreen(navController) }
        composable("ProductDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }
    }
}
