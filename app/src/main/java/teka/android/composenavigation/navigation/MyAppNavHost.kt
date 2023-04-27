package teka.android.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import teka.android.composenavigation.presentation.Details.DetailsScreen
import teka.android.composenavigation.presentation.Home.HomeScreen

@Composable
fun MyAppNavHost(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = Routes.HOME_SCREEN){

        composable(Routes.HOME_SCREEN){
            HomeScreen(navController = navController)
        }
        
        composable(Routes.DETAILS_SCREEN+"/{itemId}" ){ navBackStackEntry ->
            DetailsScreen(navController = navController, itemId = navBackStackEntry.arguments?.getString("itemId")?: "456")
        }
    }


}