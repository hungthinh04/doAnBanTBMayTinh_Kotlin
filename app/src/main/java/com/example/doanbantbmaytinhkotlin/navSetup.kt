package com.example.doanbantbmaytinhkotlin


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doanbantbmaytinhkotlin.HomeScreen
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doanbantbmaytinhkotlin.HomeScreen

@Composable
fun NavigationComponent(
    navController: NavHostController,
    isLoggedIn: Boolean,
    onLoginSuccess: () -> Unit
) {
    NavHost(navController = navController, startDestination = "Account") {
        composable("Account") { AccountScreen(navController) }
        composable("ReferFriend") { ReferFriendScreen(navController) }
//        composable("MemberPoints") { MemberPointsScreen(navController) }
//        composable("OrderManagement") { OrderManagementScreen(navController) }
//        composable("ChangeLanguage") { ChangeLanguageScreen(navController) }
//        composable("HotPromotions") { HotPromotionsScreen(navController) }
//        composable("Policy") { PolicyScreen(navController) }

    composable("Home") { HomeScreen(navController) }
        composable("Cart") { CartScreen(navController) }
        composable("Favorites") { FavoritesScreen(navController) }
        composable("Account") {
            AccountScreen(navController)
        }
        composable("Login") {
            LoginScreen(navController, onLoginSuccess = {
                onLoginSuccess()
                navController.navigate("Home") {
                    popUpTo("Login") { inclusive = true }
                }
            })
        }
        composable("Register") {
            RegisterScreen(navController)
        }
        composable("ProductDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }
    }
}
