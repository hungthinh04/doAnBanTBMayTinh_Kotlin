package utils

import com.example.doanbantbmaytinhkotlin.Product


import com.example.doanbantbmaytinhkotlin.R

fun getProductById(productId: String): Product {
    val products = listOf(
        Product("1", "RAM 16GB Corsair", 1000000, R.drawable.ram),
        Product("2", "Micro Kingston HyperX", 2000000, R.drawable.micro),
        Product("3", "Intel Core i9 14900K", 15000000, R.drawable.cpui9),
        Product("4", "RTX 4090", 61990000, R.drawable.rtx4090),
        Product("5", "Chuột Logitech G304", 1000000, R.drawable.chuot)
    )
    return products.find { it.id == productId }
        ?: Product("0", "Sản phẩm không tồn tại", 0, R.drawable.ic_google)
}
