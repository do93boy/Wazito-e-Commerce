package com.example.wazitoecommerce.ui.theme.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Here",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = {Text(text = "Enter email")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Register instead")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    WazitoECommerceTheme {
        LoginScreen(navController = rememberNavController())
    }
}