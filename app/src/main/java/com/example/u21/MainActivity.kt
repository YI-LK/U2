package com.example.u21


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.example.u2.ui.theme.U2Theme
import com.example.u21.ui.theme.U21Theme
import java.lang.Math.pow
import kotlin.math.sqrt
//import lib.exp.java.net.objecthunter.exp4j.Expression
//import lib.exp.java.net.objecthunter.exp4j.ExpressionBuilder

//import com.example.uu2.ui.theme.Uu2Theme

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // 确保正确导入并使用此方法
        setContent {
            U21Theme { // 确保导入正确的主题类
                Surface(modifier = Modifier.fillMaxSize()) { // 确保 NavHost 在 Surface 内部
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main") {
                        composable("main") {
                            MainScreen(navController)
                        }
                        composable("option1") {
                            Option1Screen(navController)
                        }
                        composable("option2") {
                            Option2Screen(navController)
                        }
                        composable("option3") {
                            Option3Screen(navController)
                        }
                        composable("option4") {
                            Option4Screen(navController)
                        }

                        composable("option4ph") {
                            Option4_phScreen(navController)
                        }
                        composable("option4ch") {
                            Option4_chScreen(navController)
                        }
                        composable("option4ma") {
                            Option4_maScreen(navController)
                        }
                        composable("option4qt") {
                            Option4_qtScreen(navController)
                        }


                        composable("option5") {
                            Option5Screen(navController)
                        }

                        composable("option6") {
                            Option6Screen(navController)
                        }

                        composable("option611") {
                            Option611Screen(navController)
                        }

                        composable("option612") {
                            Option612Screen(navController)
                        }

                        composable("option613") {
                            Option613Screen(navController)
                        }

                        composable("option614") {
                            Option614Screen(navController)
                        }

                        composable("option51") {
                            Option51Screen(navController)
                        }

                        composable("option52") {
                            Option52Screen(navController)
                        }

                        composable("option11"){
                            Option11Screen(navController)
                        }

                        composable("option111"){
                            Option111Screen(navController)
                        }

                        composable("option211"){
                            Option211Screen(navController)
                        }

                        composable("option2111"){
                            Option2111Screen(navController)
                        }

                        composable("option21111"){
                            Option21111Screen(navController)
                        }

                        composable("option211111"){
                            Option211111Screen(navController)
                        }

                        composable("option212"){
                            Option212Screen(navController)
                        }

                        composable("option2121"){
                            Option2121Screen(navController)
                        }

                        composable("option21211"){
                            Option21211Screen(navController)
                        }

                        composable("option212111"){
                            Option212111Screen(navController)
                        }

                        composable("option2121111"){
                            Option2121111Screen(navController)
                        }

                        composable("option2121111h"){
                            Option2121111hScreen(navController)
                        }

                        composable("option213"){
                            Option213Screen(navController)
                        }

                        composable("option213x"){
                            Option213xScreen(navController)
                        }

                        composable("option213p"){
                            Option213pScreen(navController)
                        }

                        composable("option213z"){
                            Option213zScreen(navController)
                        }

                        composable("option213X"){
                            Option213XScreen(navController)
                        }

                        composable("option213Y"){
                            Option213YScreen(navController)
                        }

                        composable("option2130"){
                            Option2130Screen(navController)
                        }

                        composable("option31"){
                            Option31Screen(navController)
                        }

                        composable("option311"){
                            Option311Screen(navController)
                        }

                        composable("option3111"){
                            Option3111Screen(navController)
                        }

                        composable("mainScreen"){
                            MainScreen(navController)
                        }

                        composable("ExpressScreen1")
                        {
                            expressScreen1(navController)
                        }

                        composable("ExpressScreen2")
                        {
                            expressScreen2(navController)
                        }

                        composable("textScreen"){
                            OptionTextScreen(navController)
                        }

                        composable("hoqv") {
                            hoqv()
                        }

                    }
                }
            }
        }
    }
}

//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MenuButton("数据处理") { navigateToOption1(navController) }
        MenuButton("函数式") { navigateToOption6(navController) }
        MenuButton("最小二乘拟合") { navigateToOption2(navController) }
        MenuButton("齐次线性方程组求解") { navigateToOption3(navController) }
        MenuButton("方阵求秩&UL分解(crout)") { navigateToOption5(navController) }
        MenuButton("常数") { navigateToOption4(navController) }
        MenuButton("获取源代码") { navigateTohoqv(navController) }
    }
}



@Composable
fun MenuButton(text: String, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text(text = text)
    }
}

fun navigateToOption1(navController: NavHostController) {
    navController.navigate("option1")
}

fun navigateToOption2(navController: NavHostController) {
    navController.navigate("option2")
}

fun navigateToOption3(navController: NavHostController) {
    navController.navigate("option3")
}

fun navigateToOption4(navController: NavHostController) {
    navController.navigate("option4")
}

fun navigateToOption5(navController: NavHostController) {
    navController.navigate("option5")
}

fun navigateToOption51(navController: NavHostController) {
    navController.navigate("option51")
}

fun navigateToOption52(navController: NavHostController) {
    navController.navigate("option52")
}

fun navigateToOption6(navController: NavHostController)
{
    navController.navigate("option6")
}

fun navigateToOption611(navController: NavHostController)
{
    navController.navigate("option611")
}

fun navigateToOption612(navController: NavHostController)
{
    navController.navigate("option612")
}

fun navigateToOption613(navController: NavHostController)
{
    navController.navigate("option613")
}

fun navigateToOption614(navController: NavHostController)
{
    navController.navigate("option614")
}

fun navigateTohoqv(navController: NavHostController)
{
    navController.navigate("hoqv")
}

fun navigateToOption4ph(navController: NavHostController) {
    navController.navigate("option4ph")
}

fun navigateToOption4ch(navController: NavHostController) {
    navController.navigate("option4ch")
}

fun navigateToOption4ma(navController: NavHostController) {
    navController.navigate("option4ma")
}

fun navigateToOption4qt(navController: NavHostController) {
    navController.navigate("option4qt")
}

fun navigateToOption11(navController: NavHostController) {
    navController.navigate("option11")
}

fun navigateToOption111(navController: NavHostController) {
    navController.navigate("option111")
}

fun navigateToOption211(navController: NavHostController){
    navController.navigate("option211")
}

fun navigateToOption2111(navController: NavHostController){
    navController.navigate("option2111")
}

fun navigateToOption21111(navController: NavHostController){
    navController.navigate("option21111")
}

fun navigateToOption211111(navController: NavHostController){
    navController.navigate("option211111")
}

fun navigateToOption212(navController: NavHostController){
    navController.navigate("option212")
}

fun navigateToOption2121(navController: NavHostController){
    navController.navigate("option2121")
}

fun navigateToOption21211(navController: NavHostController){
    navController.navigate("option21211")
}

fun navigateToOption212111(navController: NavHostController){
    navController.navigate("option212111")
}

fun navigateToOption2121111(navController: NavHostController){
    navController.navigate("option2121111")
}

fun navigateToOption2121111h(navController: NavHostController){
    navController.navigate("option2121111h")
}

fun navigateToOption213(navController: NavHostController){
    navController.navigate("option213")
}

fun navigateToOption213x(navController: NavHostController){
    navController.navigate("option213x")
}

fun navigateToOption213p(navController: NavHostController){
    navController.navigate("option213p")
}

fun navigateToOption213z(navController: NavHostController){
    navController.navigate("option213z")
}

fun navigateToOption213X(navController: NavHostController){
    navController.navigate("option213X")
}

fun navigateToOption213Y(navController: NavHostController){
    navController.navigate("option213Y")
}

fun navigateToOption2130(navController: NavHostController){
    navController.navigate("option2130")
}

fun navigateToOption31(navController: NavHostController){
    navController.navigate("option31")
}

fun navigateToOption311(navController: NavHostController){
    navController.navigate("option311")
}

fun navigateToOption3111(navController: NavHostController){
    navController.navigate("option3111")
}

fun navigateToMainScreen(navController: NavHostController){
    navController.navigate("mainScreen")
}

fun navigateToTextScreen(navController: NavHostController){
    navController.navigate("textScreen")
}

fun navigateToExpressScreen1(navController: NavHostController)
{
    navController.navigate("ExpressScreen1")
}

fun navigateToExpressScreen2(navController: NavHostController)
{
    navController.navigate("ExpressScreen2")
}

@Composable
fun hoqv()
{
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("这个应用使用Android Studio 2024基于kotlin编写，感谢AS提供的资源\n" +
                "通过百度网盘分享的文件：MainActivity.kt\n" +
                "链接：https://pan.baidu.com/s/1NsOT4envNE4sFcMzK4hejA?pwd=6666 \n" +
                "提取码：6666" )
    }
}

@Composable
fun Option2Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption211(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("直线最小二乘")
        }

        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption212(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("多元最小二乘")
        }

        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption213(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("多项式最小二乘")
        }

        MenuButton("回到首页") { navigateToMainScreen(navController) }


    }
}

@Composable
fun Option1Screen(navController: NavHostController) {
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    //sd.jd=number.toDouble()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入仪器测量精度误差", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        Spacer(modifier = Modifier.height(16.dp)) // 添加一些间距

        // 添加按钮
        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption11(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }
}

@Composable
fun Option3Screen(navController: NavHostController) {
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入未知数个数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        Spacer(modifier = Modifier.height(16.dp)) // 添加一些间距

        // 添加按钮
        Button(
            onClick = {
                // 检查输入是否为空或有效
                if (number.isNotEmpty()) {
                    try {
                        val intValue = number.toInt()
                        // 导航到 Option 11 并携带输入的整数值
                        navigateToOption31(navController)
                        x=number.toInt()
                    } catch (e: NumberFormatException) {
                        // 处理输入转换错误
                    }
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option4Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MenuButton("物理常数") { navigateToOption4ph(navController) }
        MenuButton("化学常熟") { navigateToOption4ch(navController) }
        MenuButton("数学常数") { navigateToOption4ma(navController) }
        MenuButton("其他常数") { navigateToOption4qt(navController) }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option4_phScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text("光速（真空中） c=299792458m/s")
        Text("普朗克常数 h=6.62607015×10^(-34)J·s")
        Text("引力常数 G=6.67430x10^(-11)m^3/(kg·s)")
        Text("玻尔兹曼常数 k=1.380649x10^(-23)J/K")
        Text("电子电荷 e=1.602176634x10^(-19)C")
        Text("阿伏伽德罗常数 N_A=6.02214076x10^(23) /mol")
        Text("质子质量 m_p=1.67262192369x10^(-27)kg")
        Text("电子质量 m_e=9.1093837015x10(-31) kg")
        Text("万有气体常数 R=8.314462618 J/(mol·K)")
        Text("斯特潘-玻尔兹曼常数 5.670374419x10(-8) W/(m^2·K^4")
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option4_chScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text("原子质量单位 u=1.66053906660x10^(-27)kg")
        Text("法拉第常数 F=96485.33212C/mol")
        Text("第一辐射常数 C_1=3.74177183W·m^2)")
        Text("第二辐射常数 C_2=1.4387772m·K")
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option4_qtScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text("地球半径 R=6371km")
        Text("太阳半径 R=6.9634x10^5 km")
        Text("重力加速度 g=9.80665 m/(s^2)")
        Text("标准大气压 P_0=101325Pa")
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option4_maScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start
    ){
        Text("圆周率 π=3.141592653589793...")
        Text("自然对数 e=2.718281828459045...")
        Text("黄金比例 =1.618033988749895...")
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option11Screen(navController: NavHostController) {
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(number!="")
                {
                    addNumber(number, numbersList)
                    sd.datas.add(number.toDouble())
                }
                else{

                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!sd.datas.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    sd.datas.removeLast()
                }
                else
                {

                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        // 显示已添加的数据
        Text(
            text = "已输入数据列表: ${sd.datas.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(!sd.datas.isEmpty())
            {
                navigateToOption111(navController)
            }
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option211Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("请输入数据组个数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if (number!="")
                {// 导航到 Option 11
                    navigateToOption2111(navController)
                    Lx = number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }


    }
}

@Composable
fun Option2111Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入x数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(LX.size<Lx&&number!="") {
                    addNumber(number, numbersList)
                    LX.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!LX.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    LX.removeLast()
                }

            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        // 显示已添加的数据
        Text(
            text = "已输入数据列表: ${LX.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(LX.size==Lx)
            {
                navigateToOption21111(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption211(navController)
            LX.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option21111Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入y数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(LY.size<Lx&&number!="") {
                    addNumber(number, numbersList)
                    LY.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!LY.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    LY.removeLast()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        Text(
            text = "x已输入数据列表: ${LX.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        // 显示已添加的数据
        Text(
            text = "y已输入数据列表: ${LY.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(LY.size==Lx)
            {
                navigateToOption211111(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption2111(navController)
            LY.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option211111Screen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("形如y=kx+b,有拟合直线:")
        Text("k="+ L2_k(LX,LY).toString())
        Text("b="+ L2_b(Average(LX), Average(LY),L2_k(LX,LY)))
        Text("皮尔逊相关系数   r="+ L2_piers(LX,LY).toString())
        Button(
            onClick = {
                // 导航到 Option 11
                navigateToMainScreen(navController)
                LX.clear()
                LY.clear()
                Lx=0
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("完成")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option212Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("请输入x的个数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption2121(navController)
                    DLx = number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }

        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }
}

@Composable
fun Option2121Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("请输入方程的个数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption21211(navController)
                    DLh = number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }

        MenuButton("上一步") {
            navigateToOption212(navController)
            DLh=0
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }
}

@Composable
fun Option21211Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入x数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(DLX.size<DLx*DLh+1&&number!="") {
                    addNumber(number, numbersList)
                    DLX.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!DLX.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    DLX.removeLast()
                }

            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        MenuButton("解释") {
            navigateToExpressScreen2(navController)

        }

        // 显示已添加的数据
        Text(
            text = "已输入数据列表: ${DLX.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(DLX.size==DLh*DLx)
            {
                navigateToOption212111(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption2121(navController)
            DLX.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option212111Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入y数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(DLY.size<DLh+1&&number!="") {
                    addNumber(number, numbersList)
                    DLY.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!DLY.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    DLY.removeLast()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        // 显示已添加的数据
        Text(
            text = "y已输入数据列表: ${DLY.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(DLY.size==DLh)
            {
                navigateToOption2121111h(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption21211(navController)
            DLY.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option2121111Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        if (A_det2(A_mult(A_trans(A_det0_plus1(DLX, DLx)), A_det0_plus1(DLX, DLx))) != 0.0) {
            Text("(非正则)形如a_n*x_n+...+a_2*x_2+a_1*x_1+a_0=y,a_0至a_n分别为:")

            val XX = A_mult(
                A_inv(A_mult(A_trans(A_det0_plus1(DLX, DLx)), A_det0_plus1(DLX, DLx))), A_mult(
                    A_trans(A_det0_plus1(DLX, DLx)), A_det10(DLY)
                )
            )

            for (i in 0 until XX.size)
                Text(XX[i][0].toString())

            Text("R^2:  "+ A_det_R_2(XX,A_det0(DLX,DLx), A_det10(DLY)).toString())
            Text("Adjusted R^2:  "+ A_det_ADR_2(XX,A_det0(DLX,DLx), A_det10(DLY)).toString())


            MenuButton("完成") { navigateToMainScreen(navController) }


        }
        else {
            Text("(正则)形如a_n*x_n+...+a_2*x_2+a_1*x_1+a_0=y,a_0至a_n分别为:")

            val XX = A_mult(
                A_inv(
                    A_det0_plus01(
                        A_mult(A_trans(A_det0_plus1(DLX, DLx)), A_det0_plus1(DLX, DLx)),
                        DL_lamda
                    )
                ), A_mult(A_trans(A_det0_plus1(DLX, DLx)), A_det10(DLY))
            )


            for (i in 0 until XX.size)
                Text(XX[i][0].toString())

            Text("R^2:  "+ A_det_R_2(XX,A_det0(DLX,DLx), A_det10(DLY)).toString())
            Text("Adjusted R^2:  "+ A_det_ADR_2(XX,A_det0(DLX,DLx), A_det10(DLY)).toString())

            MenuButton("上一步") {
                navigateToOption2121111h(navController)
                DL_lamda=0.0
            }

            MenuButton("完成") {
                navigateToMainScreen(navController)

                DLX.clear()
                DLY.clear()
                DLx=0
                DLh=0
                DL_lamda=0.0
            }

        }


        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }
}




@Composable
fun Option2121111hScreen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("请输入正则化参数:", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }

            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {
                    // 导航到 Option 11
                    navigateToOption2121111(navController)
                    DL_lamda = number.toDouble()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }

        MenuButton("上一步") {
            navigateToOption212111(navController)
            DL_lamda=0.0
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213Screen(navController: NavHostController) {
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入数据的对数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption213z(navController)
                    DZx = number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213xScreen(navController: NavHostController) {
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入拟合的x的最高次数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        Button(
            onClick = {

                // 导航到 Option 11
                navigateToOption213X(navController)
                DZp = 0

            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("上一步")
        }

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption213p(navController)
                    DZp = number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213pScreen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入正则化参数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许实数输入
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption213x(navController)
                DZ_lamda = 0.0
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("上一步")
        }

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption213Y(navController)
                    DZ_lamda = number.toDouble()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213zScreen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入x数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(DZX.size<DZx&&number!="") {
                    addNumber(number, numbersList)
                    DZX.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!DZX.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    DZX.removeLast()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        // 显示已添加的数据
        Text(
            text = "已输入数据列表: ${DZX.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(DZX.size==DZx)
            {
                navigateToOption213X(navController)
            }
        }

        MenuButton("clear") {
            DZX.clear()

        }

        MenuButton("上一步") {
            navigateToOption213(navController)
            DZX.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213XScreen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    val numbersList = remember { mutableStateListOf<Double>() } // 保存已添加的数字列表
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("请输入y数据")

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    number = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(number, numbersList)
                number=""
            })
        )

        // 添加数据按钮
        Button(
            onClick = {
                if(DZY.size< DZx&&number!="") {
                    addNumber(number, numbersList)
                    DZY.add(number.toDouble())
                    number = ""
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("添加数据")
        }

        // 删除数据按钮
        Button(
            onClick = {
                if(!DZY.isEmpty())
                {
                    deleteLastNumber(numbersList)
                    DZY.removeLast()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("删除数据")
        }

        Text(
            text = "x已输入数据列表: ${DZX.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )
        // 显示已添加的数据
        Text(
            text = "y已输入数据列表: ${DZY.joinToString(", ") { "%.15f".format(it) }}",
            style = MaterialTheme.typography.bodyMedium
        )

        MenuButton("下一步") {
            if(DZY.size==DZx)
            {
                navigateToOption213x(navController)
            }
        }

        MenuButton("clear") {
            DZY.clear()

        }

        MenuButton("上一步") {
            navigateToOption213z(navController)
            DZY.clear()
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option213YScreen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        if (A_det2(A_mult(A_trans(A_det1_pow(DZX, DZp)), A_det1_pow(DZX, DZp))) != 0.0) {
            Text("(非正则)形如a_n*x^n+...+a_2*x^2+a_1*x^1+a_0=y,a_0至a_n分别为:")

            val XX = A_mult(
                A_inv(A_mult(A_trans(A_det1_pow(DZX, DZp)), A_det1_pow(DZX, DZp))), A_mult(
                    A_trans(A_det1_pow(DZX, DZp)), A_det10(DZY)
                )
            )

            for (i in 0 until XX.size)
                Text(XX[i][0].toString())

            Text("R^2:  "+ A_det_R_2_DZ(XX,A_det1_pow(DZX, DZp),A_det10(DZY)))
            //Text("Adjusted R^2:  "+A_det_ADR_2_DZ(XX,A_det1_pow(DZX, DZp),A_det10(DZY)))

            MenuButton("修改拟合最高次数") {
                navigateToOption213x(navController)
                DZp=0
            }

            MenuButton("完成") { navigateToMainScreen(navController) }



        }
        else {
            Text("(正则)形如a_n*x^n+...+a_2*x^2+a_1*x^1+a_0=y,a_0至a_n分别为:")

            val XX = A_mult(
                A_inv(
                    A_det0_plus01(
                        A_mult(A_trans(A_det1_pow(DZX, DZp)), A_det1_pow(DZX, DZp)),
                        DZ_lamda
                    )
                ), A_mult(A_trans(A_det1_pow(DZX, DZp)), A_det10(DZY))
            )



            for (i in 0 until XX.size)
                Text(XX[i][0].toString())

            Text("R^2:  "+ A_det_R_2_DZ(XX,A_det1_pow(DZX, DZp),A_det10(DZY)))
            //Text("Adjusted R^2:  "+A_det_ADR_2_DZ(XX,A_det1_pow(DZX, DZp),A_det10(DZY)))

            MenuButton("修改拟合最高次数") {
                navigateToOption213x(navController)
                DZp=0
            }

            MenuButton("完成") {
                navigateToMainScreen(navController)

                DZX.clear()
                DZY.clear()
                DZx=0
                DZp=0
                DZ_lamda=0.0
            }

        }

        MenuButton("回到首页") { navigateToMainScreen(navController) }


    }
}

@Composable
fun Option2130Screen(navController: NavHostController)
{

}

// 添加数字到列表
private fun addNumber(numberStr: String, numbersList: MutableList<Double>) {
    val number = numberStr.toDoubleOrNull()
    if (number != null) {
        numbersList.add(number)
        // 清空输入框

    }
}

// 删除最后一个数字
private fun deleteLastNumber(numbersList: MutableList<Double>) {
    if (numbersList.isNotEmpty()) {
        numbersList.removeAt(numbersList.lastIndex)
    }
}


@Composable
fun Option111Screen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("和:"+summ(sd.datas).toString())
        Text("平均值："+(Average(sd.datas).toString()))
        Text("标准(误)差:"+(bianzhuncha(sd.datas).toString()))
        Text("方差"+ fangcha(sd.datas).toString())
        Text("标准偏差(贝塞尔公式 计算):"+ biesfangcha(sd.datas).toString())
        Text("标准偏差（标准误差除以根号下 n-1 计算)"+ biesfangcha_n(sd.datas).toString())
        Text("标准偏差（标准误差除以根号下 n-1 计算      与仪器误差合成):"+ biesfangcha_nn(sd.datas,sd.jd).toString())
        Text("结果(贝塞尔 置信概率67.3%):"+ Average(sd.datas).toString() +"~"+(biesfangcha_nn(sd.datas,sd.jd)* Average(sd.datas)).toString()+",E="+(biesfangcha_nn(sd.datas,sd.jd)/Average(sd.datas)*100.0).toString()+"%")
        Text("算术平均偏差:"+ccc(sd.datas).toString())
        Text("算术平均偏差与仪器误差合成:"+sqrt(ccc(sd.datas)*ccc(sd.datas)+sd.jd*sd.jd/3.0).toString())
        Text("结果（算术平均偏差    置信概率68.3%）:"+ Average(sd.datas).toString()+"~"+(Average(sd.datas)*sqrt(ccc(sd.datas)*ccc(sd.datas)+sd.jd*sd.jd/3.0)).toString()+",E="+(sqrt(ccc(sd.datas)*ccc(sd.datas)+sd.jd*sd.jd/3.0)/ Average(sd.datas)).toString())
        Button(
            onClick = {
                // 导航到 Option 11
                navigateToMainScreen(navController)
                sd.datas.clear()
                sd.jd=0.0
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("完成")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }


}

@SuppressLint("SuspiciousIndentation")
@Composable
fun Option31Screen(navController: NavHostController)
{
    var inputText by rememberSaveable { mutableStateOf("") } // 用户输入的临时存储

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("未知数个数:"+x.toString())
        Text("请输入X的矩阵:", style = MaterialTheme.typography.bodyLarge)

        // 文本输入框
        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = inputText,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    inputText = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                //addNumber(inputText, fc.XA)
                inputText=""
            })
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            // 添加数据按钮
            Button(
                onClick = {
                    if (inputText.isNotBlank()&&XA.size<x*x+1) {
                        try {
                            val number = inputText.toDouble()
                            XA.add(number)
                            inputText = "" // 清空输入框
                        } catch (e: NumberFormatException) {
                            // 如果转换失败，显示对话框提示错误
                            //             showAlertDialog("错误", "请输入有效的数字")
                        }
                    }



                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("添加数据")
            }

            // 删除最后一个数据按钮
            Button(
                onClick = {
                    if (XA.isNotEmpty()) {
                        XA.removeAt(XA.lastIndex)
                    }
                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("删除最后一个")
            }
        }

        MenuButton("下一步") {
            //
//var hhh=fc.X0.Maxi_maxi.size
            //Log.d("TAG", "Current value of myVariable: ${hhh}")

            if(XA.size==x*x)
            {
                navigateToOption311(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption3(navController)
            XA.clear()

        }

        MenuButton("解释") {
            navigateToExpressScreen1(navController)

        }

        Spacer(modifier = Modifier.height(16.dp))

        // 显示数据方阵
        if (XA.isNotEmpty()) {
            var k=0
            //val sideLength = calculateSideLength(fc.XA.size)
            Column ( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                for (i in 0 until x) {
                    Row{
                        for(j in 0 until x)
                        {
                            if(k<XA.size)
                                Text(XA[k++].toString()+"   ")
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }
}



@Composable
fun Option311Screen(navController: NavHostController)
{
    var inputText by rememberSaveable { mutableStateOf("") } // 用户输入的临时存储

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(A_det2(A_det1(XA)).toString())
        Text("未知数个数:"+x.toString())
        Text("请输入Y的矩阵:", style = MaterialTheme.typography.bodyLarge)

        // 文本输入框
        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = inputText,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    inputText = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                addNumber(inputText, YA)
                inputText=""
            })
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            // 添加数据按钮
            Button(
                onClick = {
                    if (inputText.isNotBlank()&&YA.size<x+1) {
                        try {
                            val number = inputText.toDouble()
                            YA.add(number)
                            inputText = "" // 清空输入框
                        } catch (e: NumberFormatException) {
                            // 如果转换失败，显示对话框提示错误
                            //             showAlertDialog("错误", "请输入有效的数字")
                        }
                    }



                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("添加数据")
            }

            // 删除最后一个数据按钮
            Button(
                onClick = {
                    if (YA.isNotEmpty()) {
                        YA.removeAt(YA.lastIndex)
                    }
                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("删除最后一个")
            }
        }

        MenuButton("下一步") {


            //navigateToTextScreen(navController)
            if(YA.size==x)
            {
                navigateToOption3111(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption31(navController)
            YA.clear()

        }

        Spacer(modifier = Modifier.height(16.dp))

        // 显示数据方阵
        if (YA.isNotEmpty()) {
            var k=0
            //val sideLength = calculateSideLength(fc.XA.size)
            Column ( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                for (i in 0 until x) {

                    if(k<YA.size)
                        Text(YA[k++].toString()+"")
                }

            }
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }




}


@Composable
fun Option3111Screen(navController: NavHostController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {




        Text("各解分别为:")
        Column                                                                                                                                                                                                                                     ()
        {
            if (A_det2(A_det1(XA)) == 0.0) {
                Text("无解")
            } else {

                var XX=ArrayList<ArrayList<Double>>()

                XX= A_mult(A_inv(A_det1(XA)), A_det10(YA))

                for (i in 0 until x) {
                    Text(XX[i][0].toString() + "   ")
                }
            }
        }

        MenuButton("完成") {
            navigateToMainScreen(navController)
            XA.clear()
            YA.clear()
            x = 0
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }
}

@Composable
fun Option5Screen(navController: NavHostController)
{
    var number by rememberSaveable { mutableStateOf("") } // 保存用户输入的数字
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("请输入方阵的阶数", style = MaterialTheme.typography.titleLarge)

        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = number,
            onValueChange = {
                // 只允许正整数输入
                if (it.isEmpty() || it.all { it.isDigit() }) {
                    number = it
                }
            },
            label = { Text("Enter a positive integer") },
            modifier = Modifier.fillMaxWidth(0.8f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
            })
        )

        // 添加按钮
        Button(
            onClick = {
                if(number!="")
                {// 导航到 Option 11
                    navigateToOption51(navController)
                    ULx= number.toInt()
                }
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("下一步")
        }
        MenuButton("回到首页") { navigateToMainScreen(navController) }
    }

}

@Composable
fun Option51Screen(navController: NavHostController)
{
    var inputText by rememberSaveable { mutableStateOf("") } // 用户输入的临时存储

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("阶数:"+ULx.toString())
        Text("请输入矩阵:", style = MaterialTheme.typography.bodyLarge)

        // 文本输入框
        // 添加 TextField 用于输入数字
        OutlinedTextField(
            value = inputText,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    inputText = it
                }
            },
            label = { Text("Enter a number") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(onDone = {
                // 当用户按下完成键时，可以在这里添加逻辑
                //addNumber(inputText, fc.XA)
                inputText=""
            })
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            // 添加数据按钮
            Button(
                onClick = {
                    if (inputText.isNotBlank()&&ULX.size<ULx*ULx+1) {
                        try {
                            val number = inputText.toDouble()
                            ULX.add(number)
                            inputText = "" // 清空输入框
                        } catch (e: NumberFormatException) {
                            // 如果转换失败，显示对话框提示错误
                            //             showAlertDialog("错误", "请输入有效的数字")
                        }
                    }



                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("添加数据")
            }

            // 删除最后一个数据按钮
            Button(
                onClick = {
                    if (ULX.isNotEmpty()) {
                        ULX.removeAt(ULX.lastIndex)
                    }
                },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text("删除最后一个")
            }
        }

        MenuButton("下一步") {
            //
//var hhh=fc.X0.Maxi_maxi.size
            //Log.d("TAG", "Current value of myVariable: ${hhh}")

            if(ULX.size==ULx*ULx)
            {
                navigateToOption52(navController)
            }
        }
        MenuButton("上一步") {
            navigateToOption5(navController)
            ULX.clear()

        }

        Spacer(modifier = Modifier.height(16.dp))

        // 显示数据方阵
        if (ULX.isNotEmpty()) {
            var k=0
            //val sideLength = calculateSideLength(fc.XA.size)
            Column ( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                for (i in 0 until ULx) {
                    Row{
                        for(j in 0 until ULx)
                        {
                            if(k<ULX.size)
                                Text(ULX[k++].toString()+"   ")
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        MenuButton("回到首页") { navigateToMainScreen(navController) }

    }

}

@SuppressLint("DefaultLocale")
@Composable
fun Option52Screen(navController: NavHostController)
{
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        item {
            Text("det=" + String.format("%.5f", A_det2(A_det1(ULX))))
        }



        if (ULX.isNotEmpty() && A_det2(A_det1(ULX)) != 0.0 && ULX[0] != 0.0) {

            item {
                Text("逆矩阵:")
            }

            item {
                LazyRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(ULx) { j ->
                        Text(String.format("%.5f", A_inv(A_det1(ULX))[0][j]) + "   ")
                    }
                }
                for (i in 1 until ULx) {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(ULx) { j ->
                            Text(String.format("%.5f", A_inv(A_det1(ULX))[i][j]) + "   ")
                        }
                    }
                }
            }

            item {
                Text("L:")
            }

            item {
                LazyRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(ULx) { j ->
                        Text(String.format("%.5f", A_det_LU_crout(A_det1(ULX))[0][0][j]) + "   ")
                    }
                }
                for (i in 1 until ULx) {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(ULx) { j ->
                            Text(String.format("%.5f", A_det_LU_crout(A_det1(ULX))[0][i][j]) + "   ")
                        }
                    }
                }
            }

            item {
                Text("U:")
            }

            item {
                LazyRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(ULx) { j ->
                        Text(String.format("%.5f", A_det_LU_crout(A_det1(ULX))[1][0][j]) + "   ")
                    }
                }
                for (i in 1 until ULx) {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(ULx) { j ->
                            Text(String.format("%.5f", A_det_LU_crout(A_det1(ULX))[1][i][j]) + "   ")
                        }
                    }
                }
            }







        } else {
            item {
                Text("无法分解")
            }
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
            MenuButton("完成") {
                ULX.clear()
                ULx = 0
                navigateToMainScreen(navController)
            }
        }
    }

}

@Composable
fun Option6Screen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption611(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("函数值计算")
        }

        Button(
            onClick = {
                // 导航到 Option 11
                navigateToOption613(navController)
            },
            modifier = Modifier.width(150.dp)
        ) {
            Text("区间内求零点（二分法）")
        }



    }
}

@Composable
fun Option611Screen(navController: NavHostController)
{
    var inputText by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var result by remember{ mutableStateOf("") }

    LaunchedEffect(text2, inputText) {
        try {
            val expression = ExpressionBuilder(inputText)
                .variables("x")
                .build()
                .setVariable("x", text2.toDouble())
            result = expression.evaluate().toString()
        } catch (e: Exception) {
            result = "Invalid expression"
        }
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {    // 文本框 1

        // 文本框 2
        TextField(
            value = text2,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    text2 = it
                }
            },

            label = { Text("Enter x") }
        )


        TextField(
            value = inputText,
            onValueChange = {
                inputText = it
                try {
                    val expression = ExpressionBuilder(it)
                        .variables("x")
                        .build()
                        .setVariable("x",text2.toDouble())
                    result=expression.evaluate().toString()

                } catch (e: Exception) {
                    result = "Invalid expression"
                }
            },
            label = { Text("Enter the function(variable is x)") }
        )

        Text(result)

        MenuButton("输入格式说明") {
            navigateToOption612(navController)
        }

    }
}

@Composable
fun Option612Screen(navController: NavHostController)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("运算符：%——取模运算   ^——指数运算")
        Text("支持的三角函数：sin,cos,tan,asin,acos,atan")
        Text("支持的对数：log(x)或者ln(x)——以e为底\nlg(x)——以10为底\n若以a为底b的对数则使用换底公式输入ln(b)/ln(a)")
        Text("支持的常数：pi——圆周率    e——自然底数")


    }
}

@Composable
fun Option613Screen(navController: NavHostController)
{
    var inputText by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var result by remember{ mutableStateOf("") }
    var text1 by remember { mutableStateOf("") }
    var eee by remember { mutableStateOf("") }




    LaunchedEffect(inputText, text1, text2) {
        try {
            val expression = ExpressionBuilder(inputText)
                .variables("x")
                .build()

            expression.setVariable("x", text1.toDouble())
            f_a = expression.evaluate()

            a=text1.toDouble()

            expression.setVariable("x", text2.toDouble())
            f_b = expression.evaluate()

            b=text2.toDouble()

            if (ZE_P(expression, text1.toDouble(), text2.toDouble()) == 0) {
                rr = 1
            } else {
                rr = 0
                rrr = ZE_D(expression, text1.toDouble(), text2.toDouble(), eee.toDouble())
            }
        } catch (e: Exception) {
            result = "Invalid expression"
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {    // 文本框 1

        // 文本框 2
        TextField(
            value = text1,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    text1=it
                    a = try {
                        it.toDouble()
                    } catch (e: NumberFormatException) {
                        // 如果转换失败，保持 a 的值不变
                        a
                    }

                }
            },

            label = { Text("Enter lower") }
        )



        TextField(
            value = text2,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }) {
                    text2 = it
                    b = try {
                        it.toDouble()
                    } catch (e: NumberFormatException) {
                        // 如果转换失败，保持 a 的值不变
                        b
                    }
                }
            },

            label = { Text("Enter up") }
        )

        TextField(
            value = eee,
            onValueChange = {
                // 只允许数字输入，包括负号和小数点
                if (it.isEmpty() || it.all { it.isDigit() || it == '-' || it == '.' }&&(it.toDouble()>0.0||it.toDouble()==0.0)) {
                    eee = it
                    e = try {
                        it.toDouble()
                    } catch (e: NumberFormatException) {
                        // 如果转换失败，保持 a 的值不变
                        0.0
                    }
                }
            },

            label = { Text("Enter jingdu") }
        )


        TextField(
            value = inputText,
            onValueChange = {
                inputText = it
                try {
                    val expression = ExpressionBuilder(it)
                        .variables("x")
                        .build()

                    expression.setVariable("x",a)
                    f_a=expression.evaluate()

                    expression.setVariable("x",b)
                    f_b=expression.evaluate()

                    if(ZE_P(expression,a,b)==0)
                        rr=1
                    else
                    {
                        rr = 0
                        rrr= ZE_D(expression,a,b,e)
                    }


                } catch (e: Exception) {
                    result = "Invalid expression"
                }
            },
            label = { Text("Enter the function(variable is x)") }
        )


        Text("L:"+f_a.toString()+"  U:"+f_b.toString())

        Text("a:"+a.toString()+"   b:"+b.toString())

        if(rr==1)
            Text("区间内无零点")
        if(rr==0)
            Text("零点："+ rrr.toString())

        MenuButton("输入格式说明") {
            navigateToOption612(navController)
        }
//
//        MenuButton("下一步") {
//            navigateToOption614(navController)
//        }

    }
}

@Composable
fun Option614Screen(navController: NavHostController)
{

}

fun ZE_P(exp:Expression,a:Double,b:Double):Int
{
    exp.setVariable("x",a)
    var e_a=exp.evaluate().toDouble()
    exp.setVariable("x",b)
    var e_b=exp.evaluate().toDouble()

    if(e_a*e_b>0.0)
        return 0
    else
        return 1

}

fun ZE_D(exp: Expression, a: Double, b: Double, e: Double): Double {
    //require(a != b) { "Endpoints must be different." }
    //require(e > 0) { "Precision must be positive." }

    var aa = a
    var bb = b
    var f_a = exp.setVariable("x", aa).evaluate().toDouble()
    var f_b = exp.setVariable("x", bb).evaluate().toDouble()

    // Check initial interval to ensure it contains a root.
    //require(f_a * f_b <= 0) { "The function values at endpoints must have opposite signs or one of them should be zero." }

    var e_f = Math.abs(bb - aa)

    while (e_f > e) {
        val f_m = (aa + bb) / 2.0
        exp.setVariable("x", f_m)
        val result_m = exp.evaluate().toDouble()

        if (result_m * f_a <= 0.0) {
            bb = f_m
            f_b = result_m
        } else {
            aa = f_m
            f_a = result_m
        }

        e_f = Math.abs(bb - aa)
    }

    return (aa + bb) / 2.0
}

@Composable
fun OptionTextScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            for (i in 1 until x+1) {
                Row {
                    for (j in 1 until x+1) {

                        //Text(fc.X0.AM_see(i, j).toString() + "  ")
                    }
                }
            }
        }
//            Column(
//                modifier = Modifier.fillMaxSize(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                for (i in 1 until x+1) {
//
//
//                            Text(fc.Y.AM_see(i, 1).toString() + "  ")
//
//
//                }
//            }
//            MenuButton("完成") {
//                navigateToOption3111(navController)
//
//            }


    }
}

@Composable
fun expressScreen1(navController: NavHostController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("首先，请确保您的方程组形式为 AX = B，其中A是系数矩阵，X是未知数向量，B是常数项向量")
        Text("在这个界面中,A每一行作为一个整体进行输入。这意味着首先输入第一行的所有元素，接着是第二行，依此类推，直到最后一行。")
        Text("假设你的方程组如下：")
        Text("2x+3y+6z=9")
        Text("2x-1y+7z=10")
        Text("2x+3.5y-9z=-19")
        Text("则你将依次输入2,3,6,2，-1,7,2,3.5，-9")
    }
}

@Composable
fun expressScreen2(navController: NavHostController)
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("首先，请确保您的方程组形式为 XA = B，其中A是系数矩阵,也解释你想要拟合的系数，X是未知数向量，B是常数项向量")
        Text("在这个界面中,A每一行作为一个整体进行输入。这意味着首先输入第一行的所有元素，接着是第二行，依此类推，直到最后一行。")
        Text("假设你的方程组如下：")
        Text("2a_1+3a_2+a_3=9")
        Text("2a_1-1a_2+a_3=10")
        Text("2a_1+3.5a_2+a_3=-19")
        Text("则你将依次输入2,3,2，-1,2,3.5(最后一个系数对应的数据默认为1，你不用输入)")
    }
}

class share_data {
    var jd: Double = 0.0
    var datas = ArrayList<Double>()

    constructor(jd: Double, datas: ArrayList<Double>) {
        this.jd = jd
        this.datas = datas
    }

}

fun summ(data_s: ArrayList<Double>): Double {
    var sum: Double = 0.0
    for (i in data_s.indices) {
        sum += data_s[i]
    }

    return sum
}

fun Average(data_s: ArrayList<Double>): Double {
    var sum: Double = 0.0
    for (i in data_s.indices) {
        sum += data_s[i]
    }

    return sum / data_s.size
}

fun bianzhuncha(data_s: ArrayList<Double>): Double {
    var ave = Average(data_s)
    var ssum = 0.0
    for (i in data_s.indices) {
        ssum += (data_s[i] - ave) * (data_s[i] - ave)
    }

    return ssum / data_s.size
}

fun fangcha(data_s: ArrayList<Double>): Double {
    var ave = Average(data_s)
    var ssum = 0.0
    for (i in data_s.indices) {
        ssum += (data_s[i] - ave) * (data_s[i] - ave)
    }

    return sqrt(ssum / data_s.size)


}

fun biesfangcha(data_s: ArrayList<Double>): Double {
    var ave = Average(data_s)
    var ssum = 0.0
    for (i in data_s.indices) {
        ssum += (data_s[i] - ave) * (data_s[i] - ave)
    }

    return sqrt(ssum / (data_s.size - 1))


}

fun biesfangcha_n(data_s: ArrayList<Double>): Double {
    return biesfangcha(data_s) / sqrt(data_s.size.toDouble())
}

fun biesfangcha_nn(data_s: ArrayList<Double>, w: Double): Double {
    return sqrt(biesfangcha_n(data_s) * biesfangcha_n(data_s) + w * w / 3.0)

}

fun ccc(data_s: ArrayList<Double>): Double {
    var vv = 0.0
    var pp = Average(data_s)
    for (i in data_s.indices) {
        vv += sqrt((data_s[i] - pp) * (data_s[i] - pp))
    }
    return vv / data_s.size
}

var dd: ArrayList<Double> = arrayListOf()
var sd = share_data(0.0, dd)




var x:Int=0

var XA=ArrayList<Double>()

var YA=ArrayList<Double>()

class hang(var Hang: ArrayList<Double>) {

}

class Maxi(var Maxi_hang: Int, var Maxi_lie: Int) {
    var Maxi_maxi = ArrayList<ArrayList<Double>>()

    fun Maxi_initadd(Maxi_datas: ArrayList<Double>) {
        var k = 0
        for (i in 0 until Maxi_hang) {

            var MM = ArrayList<Double>()
            for (j in 0 until Maxi_lie) {
                MM.add(Maxi_datas[k++])
            }
            Maxi_maxi.add(MM)
        }
    }

    fun Maxi_see(h: Int, l: Int): Double {
        return Maxi_maxi[h - 1][l - 1]
    }

    fun Maxi_fix(h: Int, l: Int, fix_data: Double) {
        Maxi_maxi[h - 1][l - 1] = fix_data
    }

    fun Maxi_print() {
        for (i in 1 until this.Maxi_hang + 1) {
            for (j in 1 until this.Maxi_lie + 1) {
                print(this.Maxi_see(i, j).toString() + " ")
            }
            println()
        }
    }

    operator fun plus(other: Maxi): Maxi {
        if (other.Maxi_hang != this.Maxi_hang || other.Maxi_lie != this.Maxi_lie) {
            return this
        } else {
            var Maxi_new = Maxi(this.Maxi_hang, other.Maxi_lie)
            for (i in 1 until Maxi_hang + 1) {
                var MM = ArrayList<Double>()
                for (j in 1 until Maxi_lie + 1) {
                    MM.add(this.Maxi_see(i, j) + other.Maxi_see(i, j))
                }
                Maxi_new.Maxi_maxi.add(MM)
            }
            return Maxi_new
        }
    }

    operator fun times(other: Maxi): Maxi {
        if (this.Maxi_lie != other.Maxi_hang)
            return this
        else {
            var Maxi_new = Maxi(this.Maxi_hang, other.Maxi_lie)

            for (i in 1 until this.Maxi_hang + 1) {
                var MM = ArrayList<Double>()
                for (j in 1 until other.Maxi_lie + 1) {
                    var sum = 0.0
                    for (k in 1 until this.Maxi_lie + 1) {
                        sum += this.Maxi_see(i, k) * other.Maxi_see(k, j)
                    }
                    MM.add(sum)
                }
                Maxi_new.Maxi_maxi.add(MM)
            }

            return Maxi_new
        }

    }

    fun Maix_yvzishi(h: Int, l: Int): Maxi {
        var Maxi_new = Maxi(this.Maxi_hang, this.Maxi_lie)

        for (i in 1 until this.Maxi_hang + 1) {
            var MM = ArrayList<Double>()
            for (j in 1 until this.Maxi_lie + 1) {
                MM.add(this.Maxi_see(i, j))
            }
            Maxi_new.Maxi_maxi.add(MM)
        }
        for (i in 0 until this.Maxi_hang) {
            Maxi_new.Maxi_maxi[i].removeAt(l - 1)
        }
        Maxi_new.Maxi_maxi.removeAt(h - 1)
        Maxi_new.Maxi_hang--
        Maxi_new.Maxi_lie--
        return Maxi_new
    }


    fun Maxi_det(): Double {
        if (this.Maxi_lie != this.Maxi_hang)
            return 0.0
        else {
            var det: Double = 0.0
            if (this.Maxi_lie == 1 && this.Maxi_hang == 1)
                return this.Maxi_see(1, 1)
            else {
                for (i in 1 until this.Maxi_lie + 1) {
                    if (i % 2 == 1) {
                        det += this.Maxi_see(1, i) * this.Maix_yvzishi(1, i).Maxi_det()
                    } else if (i % 2 == 0) {
                        det -= this.Maxi_see(1, i) * this.Maix_yvzishi(1, i).Maxi_det()
                    }
                }
                return det
            }
        }
    }

    fun Maxi_trans(): Maxi {
        var Maxi_new = Maxi(this.Maxi_lie, this.Maxi_hang)

        for (i in 1 until this.Maxi_lie + 1) {
            var MM = ArrayList<Double>()
            for (j in 1 until this.Maxi_hang + 1) {
                MM.add(this.Maxi_see(j, i))
            }
            Maxi_new.Maxi_maxi.add(MM)
        }

        return Maxi_new
    }

    fun Maxi_inv(): Maxi {
        if (this.Maxi_det() == 0.0 || this.Maxi_hang != this.Maxi_lie)
            return this
        else {
            var Maxi_new = Maxi(this.Maxi_hang, this.Maxi_lie)
            for (i in 1 until this.Maxi_hang + 1) {
                var MM = ArrayList<Double>()
                for (j in 1 until this.Maxi_lie + 1) {
                    MM.add(
                        pow(-1.0, (i + j).toDouble()) * this.Maix_yvzishi(i, j)
                            .Maxi_det() / this.Maxi_det()
                    )
                }
                Maxi_new.Maxi_maxi.add(MM)
            }

            Maxi_new = Maxi_new.Maxi_trans()

            return Maxi_new
        }
    }

    fun Maxi_clear() {
        this.Maxi_maxi.clear()
    }


}

class Array_Maxi(var AM_lie:Int,var AM_hang:Int,var AM_datas:ArrayList<Double>)
{
    fun AM_see(h:Int,l:Int):Double
    {
        return this.AM_datas[this.AM_lie*(h-1)+l-1]
    }

    fun AM_fix(h:Int,l:Int,fix:Double)
    {
        this.AM_datas[this.AM_lie*(h-1)+l-1]=fix
    }

    fun AM_print()
    {
        for(i in 1 until 1+this.AM_hang)
        {
            for(j in 1 until 1+this.AM_lie)
            {
                print(this.AM_see(i,j).toString()+"  ")
            }
            println()
        }
    }

    operator fun plus(other:Array_Maxi):Array_Maxi
    {
        if (other.AM_datas.size!=this.AM_datas.size)
        {
            return this
        }
        else {
            val A_new = ArrayList<Double>()
            for (i in 0 until this.AM_datas.size)
                A_new.add(this.AM_datas[i] + other.AM_datas[i])
            val AM_result = Array_Maxi(this.AM_hang, this.AM_lie, A_new)
            return AM_result
        }
    }

    operator fun times(other: Array_Maxi):Array_Maxi
    {
        if(this.AM_lie!=other.AM_hang)
        {
            return this
        }
        else
        {
            val A_new=ArrayList<Double>()
            for(k in 0 until this.AM_hang*other.AM_lie)
            {
                A_new.add(0.0)
            }
            val AM_result=Array_Maxi(this.AM_hang,other.AM_lie,A_new)
            for(i in 1 until this.AM_hang+1)
            {
                for(j in 1 until other.AM_lie+1)
                {
                    var ssum=0.0
                    for(k in 1 until 1+this.AM_lie)
                    {
                        ssum+=this.AM_see(i,k)*other.AM_see(k,j)
                    }
                    AM_result.AM_fix(i,j,ssum)
                }
            }

            return AM_result
        }
    }

    fun AM_trans():Array_Maxi
    {
        var A_new=ArrayList<Double>()
        for(i in 0 until this.AM_hang*this.AM_lie)
            A_new.add(0.0)
        var AM_new=Array_Maxi(this.AM_lie,this.AM_hang,A_new)
        for(i in 1 until 1+this.AM_lie)
        {
            for(j in 1 until 1+this.AM_hang)
            {
                AM_new.AM_fix(i,j,this.AM_see(j,i))
            }
        }
        return AM_new
    }

    fun AM_yvzishi(h:Int,l:Int):Array_Maxi
    {
        var A_new=ArrayList<Double>()
        for(i in 0 until (this.AM_hang-1)*(this.AM_lie-1))
            A_new.add(0.0)
        var AM_new=Array_Maxi(this.AM_hang-1,this.AM_lie-1,A_new)
        for(i in 1 until h)
            for(j in l+1 until this.AM_lie+1)
                AM_new.AM_fix(i,j-1,this.AM_see(i,j))

        for(i in h+1 until this.AM_hang+1)
            for(j in 1 until l)
                AM_new.AM_fix(i-1,j,this.AM_see(i,j))

        for(i in 1 until h)
            for(j in 1 until l)
                AM_new.AM_fix(i,j,this.AM_see(i,j))

        for(i in 1+h until this.AM_hang+1)
            for(j in l+1 until this.AM_lie+1)
                AM_new.AM_fix(i-1,j-1,this.AM_see(i,j))

        return AM_new
    }

    fun AM_det():Double
    {
        if(this.AM_lie!=this.AM_hang)
            return 0.0
        else
        {
            var det:Double=0.0
            if(this.AM_lie==1&&this.AM_hang==1)
                return this.AM_see(1,1)

            else
            {
                for(i in 1 until this.AM_lie+1)
                {
                    if(i%2==1)
                    {
                        det+=this.AM_see(1,i)*this.AM_yvzishi(1,i).AM_det()
                    }
                    else if(i%2==0)
                    {
                        det-=this.AM_see(1,i)*this.AM_yvzishi(1,i).AM_det()
                    }
                }
                return det
            }
        }
    }

    fun AM_inv():Array_Maxi
    {
        if(this.AM_det()==0.0||this.AM_hang!=this.AM_lie)
            return this
        else
        {
            var MM=ArrayList<Double>()
            for(i in 1 until this.AM_hang+1)
            {

                for(j in 1 until this.AM_lie+1)
                {
                    MM.add(pow(-1.0,(i+j).toDouble())*this.AM_yvzishi(i,j).AM_det()/this.AM_det())
                }

            }
            var Maxi_new=Array_Maxi(this.AM_hang,this.AM_lie,MM)
            Maxi_new=Maxi_new.AM_trans()

            return Maxi_new
        }
    }

    fun AM_clear()
    {
        this.AM_datas.clear()
    }

}

fun A_det1(A:ArrayList<Double>):ArrayList<ArrayList<Double>>{

    val x=sqrt(A.size.toDouble())

    var amaxi=ArrayList<ArrayList<Double>>()

    var k=0

    for(i in 0 until x.toInt())
    {
        var am=ArrayList<Double>()
        for(j in 0 until x.toInt())
        {
            am.add(A[k++])
        }
        amaxi.add(am)

    }
    return amaxi
}


fun A_det2(A: ArrayList<ArrayList<Double>>): Double {
    var det = 0.0

    // 检查是否为1x1矩阵
    if (A.size == 1) {
        return A[0][0]
    }

    // 优化2x2矩阵的计算
    if (A.size == 2) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0]
    }

    // 对于更大的矩阵，递归计算
    else{
        for (k in 0 until A.size) {
            // 创建子矩阵
            val subMatrix = ArrayList<ArrayList<Double>>()
            for (i in 1 until A.size) {
                val newRow = ArrayList<Double>()
                for (j in 0 until A.size) {
                    if (j != k) {
                        newRow.add(A[i][j])
                    }
                }
                if (newRow.isNotEmpty()) {
                    subMatrix.add(newRow)
                }
            }

            // 计算子矩阵的行列式
            det += pow(-1.0, (k + 2) * 1.0) * A[0][k] * A_det2(subMatrix)
        }

        return det
    }
}

fun A_det0_plus1(A:ArrayList<Double>,l:Int):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()
    var k=0
    for(i in 0 until A.size/l)
    {
        var am=ArrayList<Double>()
        am.add(1.0)
        for (j in 0 until l)
        {
            am.add(A[k++])
        }

        AA.add(am)
    }
    return AA
}

fun A_trans(A:ArrayList<ArrayList<Double>>):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()

    for(i in 0 until A[0].size)
    {
        var am=ArrayList<Double>()

        for(j in 0 until A.size)
        {
            am.add(A[j][i])
        }

        AA.add(am)
    }

    return AA
}

fun A_print(A:ArrayList<ArrayList<Double>>)
{
    for(i in 0 until A.size)
    {
        for(j in 0 until A[i].size)
            print(A[i][j].toString()+"  ")
        println()
    }
}


fun A_inv(A: ArrayList<ArrayList<Double>>): ArrayList<ArrayList<Double>> {
    require(A.size == A[0].size) { "Matrix must be square." }

    var AA = ArrayList<ArrayList<Double>>()

    for (i in 0 until A.size) {
        val am = ArrayList<Double>()
        for (j in 0 until A.size) {
            val AAA = ArrayList<ArrayList<Double>>()

            // 构建子矩阵
            for (ii in 0 until A.size) {
                if (ii == i) continue // 跳过当前行

                val aam = ArrayList<Double>()
                for (jj in 0 until A[ii].size) {
                    if (jj == j) continue // 跳过当前列
                    aam.add(A[ii][jj])
                }
                AAA.add(aam)
            }

            // 计算子矩阵的行列式
            am.add(A_det2(AAA))
        }
        AA.add(am)
    }

    // 转置矩阵
    AA = A_trans(AA)

    // 计算逆矩阵
    val det = A_det2(A)
    require(det != 0.0) { "Matrix is singular and cannot be inverted." }
    for (i in AA.indices) {
        for (j in AA[i].indices) {
            AA[i][j] /= det
            AA[i][j]*=pow(-1.0,i+j*1.0)
        }
    }

    return AA
}

fun A_mult(A: ArrayList<ArrayList<Double>>, B: ArrayList<ArrayList<Double>>): ArrayList<ArrayList<Double>> {
    // 检查矩阵维度是否允许乘法
    require(A[0].size == B.size) { "The number of columns in the first matrix must be equal to the number of rows in the second matrix." }

    val A_new = ArrayList<ArrayList<Double>>()

    for (i in 0 until A.size) {
        val am = ArrayList<Double>()
        for (j in 0 until B[0].size) {
            am.add(0.0)
        }
        A_new.add(am)
    }

    for (i in 0 until A.size) {
        for (j in 0 until B[0].size) {
            var sum = 0.0
            for (k in 0 until B.size) {
                sum += A[i][k] * B[k][j]
            }
            A_new[i][j] = sum
        }
    }

    return A_new
}

fun A_det10(A:ArrayList<Double>):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()

    var k=0

    for(i in 0 until A.size)
    {
        var am=ArrayList<Double>()
        am.add(A[k++])
        AA.add(am)
    }

    return AA
}

fun A_det0(A:ArrayList<Double>,l:Int):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()
    var k=0
    for(i in 0 until A.size/l)
    {
        var am=ArrayList<Double>()
        for (j in 0 until l)
        {
            am.add(A[k++])
        }
        AA.add(am)
    }
    return AA
}

fun A_det0_plus01(A:ArrayList<ArrayList<Double>>,lada:Double):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()

    for(i in 0 until A.size) {
        var am=ArrayList<Double>()
        for (j in 0 until A[i].size)
        {
            am.add(A[i][j])
        }
        AA.add(am)
    }

    for(i in 0 until A.size)
    {
        AA[i][i]+=lada
    }

    return AA
}

fun A_det1_pow(A:ArrayList<Double>,p:Int):ArrayList<ArrayList<Double>>
{
    var AA=ArrayList<ArrayList<Double>>()

    for(i in 0 until A.size)
    {
        var am=ArrayList<Double>()

        for(j in 0 until p+1)
            am.add(pow(A[i],j.toDouble()))

        AA.add(am)
    }

    return AA
}

fun A_det_R_2(A:ArrayList<ArrayList<Double>>,X:ArrayList<ArrayList<Double>>,Y:ArrayList<ArrayList<Double>>):Double
{
    var R:Double=0.0

    var SSE=0.0

    for(i in 0 until Y.size)
    {

        var Y_R=A[0][0]

        for(j in 0 until X[i].size)
        {
            Y_R+=A[j+1][0]*X[i][j]
        }

        SSE+=(Y[i][0]-Y_R)*(Y[i][0]-Y_R)

    }


    var Y_Aver=0.0

    for(i in 0 until Y.size)
        Y_Aver+=Y[i][0]

    Y_Aver/=Y.size

    var SST=0.0

    for(i in 0 until Y.size)
        SST+=(Y[i][0]-Y_Aver)*(Y[i][0]-Y_Aver)

    R=1-SSE/SST

    //R=1-(1-R)*((Y.size-1)/(Y.size-X[0].size-1))

    return R
}

fun A_det_ADR_2(A:ArrayList<ArrayList<Double>>,X:ArrayList<ArrayList<Double>>,Y:ArrayList<ArrayList<Double>>):Double
{
    var R:Double=0.0

    var SSE=0.0

    for(i in 0 until Y.size)
    {

        var Y_R=A[0][0]

        for(j in 0 until X[i].size)
        {
            Y_R+=A[j+1][0]*X[i][j]
        }

        SSE+=(Y[i][0]-Y_R)*(Y[i][0]-Y_R)

    }


    var Y_Aver=0.0

    for(i in 0 until Y.size)
        Y_Aver+=Y[i][0]

    Y_Aver/=Y.size

    var SST=0.0

    for(i in 0 until Y.size)
        SST+=(Y[i][0]-Y_Aver)*(Y[i][0]-Y_Aver)

    R=1-SSE/SST

    R=1-(1-R)*((Y.size-1)/(Y.size-X[0].size-1))

    return R
}


fun A_det_R_2_DZ(A:ArrayList<ArrayList<Double>>,X:ArrayList<ArrayList<Double>>,Y:ArrayList<ArrayList<Double>>):Double
{
    var R:Double=0.0

    var SSE=0.0

    for(i in 0 until Y.size)
    {

        var Y_R=0.0

        for(j in 0 until X[i].size)
        {
            Y_R+=A[j][0]*X[i][j]
        }

        SSE+=(Y[i][0]-Y_R)*(Y[i][0]-Y_R)

    }


    var Y_Aver=0.0

    for(i in 0 until Y.size)
        Y_Aver+=Y[i][0]

    Y_Aver/=Y.size

    var SST=0.0

    for(i in 0 until Y.size)
        SST+=(Y[i][0]-Y_Aver)*(Y[i][0]-Y_Aver)

    R=1-SSE/SST

    //R=1-(1-R)*((Y.size-1)/(Y.size-X[0].size-1))

    return R
}

fun A_det_ADR_2_DZ(A:ArrayList<ArrayList<Double>>,X:ArrayList<ArrayList<Double>>,Y:ArrayList<ArrayList<Double>>):Double
{
    var R:Double=0.0

    var SSE=0.0

    for(i in 0 until Y.size)
    {

        var Y_R=0.0

        for(j in 0 until X[i].size)
        {
            Y_R+=A[j][0]*X[i][j]
        }

        SSE+=(Y[i][0]-Y_R)*(Y[i][0]-Y_R)

    }


    var Y_Aver=0.0

    for(i in 0 until Y.size)
        Y_Aver+=Y[i][0]

    Y_Aver/=Y.size

    var SST=0.0

    for(i in 0 until Y.size)
        SST+=(Y[i][0]-Y_Aver)*(Y[i][0]-Y_Aver)

    R=1-SSE/SST

    R=1-(1-R)*((Y.size-1)/(Y.size-X[0].size-1))

    return R
}

fun A_det_LU_crout(A:ArrayList<ArrayList<Double>>):ArrayList<ArrayList<ArrayList<Double>>>
{
    var LU=ArrayList<ArrayList<ArrayList<Double>>>()

    if(A[0][0]==0.0||A.size!=A[0].size||A_det2(A)==0.0)
    {
        LU.add(A)
    }

    else
    {
        var L=ArrayList<ArrayList<Double>>()
        var U=ArrayList<ArrayList<Double>>()

        for(i in 0 until A.size)
        {
            var AL=ArrayList<Double>()
            var AU=ArrayList<Double>()

            for(j in 0 until A[i].size)
            {
                AL.add(0.0)
                AU.add(0.0)
            }

            L.add(AL)
            U.add(AU)
        }

        for(i in 0 until A.size)
        {
            U[i][i] = 1.0
            L[i][0]=A[i][0]
            if(i!=0)
                U[0][i]=A[0][i]/A[0][0]
        }

        for(i in 1 until A.size)
        {
            for(j in i until A.size)
            {
                var sum=A[j][i]

                for(k in 0 until i)
                {
                    sum -= L[j][k] * U[k][i]
                    //println(L[j][k].toString()+"*"+U[k][i].toString())
                }

                L[j][i]=sum
            }

            for(j in i+1 until A.size)
            {
                var sum=A[i][j]

                for(k in 0 until i)
                {
                    sum-=L[i][k]*U[k][j]
                    //println(L[i][k].toString()+"*"+U[k][j].toString())
                }

                sum/=L[i][i]
                //println(L[i][i])
                U[i][j]=sum
            }

        }

        LU.add(L)
        LU.add(U)
    }

    return LU
}


fun L2_k(X:ArrayList<Double>,Y:ArrayList<Double>):Double
{
    var k=0.0

    var X_a= Average(X)
    var Y_a= Average(Y)

    var s=0.0
    var m=0.0

    for(i in 0 until Lx)
    {
        s+=(LX[i]-X_a)*(LY[i]-Y_a)

        m+=(LX[i]-X_a)*(LX[i]-X_a)
    }

    k=s/m

    return k
}

fun L2_b(X_a:Double,Y_a:Double,k:Double):Double
{
    return Y_a-k*X_a
}

fun L2_piers(X:ArrayList<Double>,Y:ArrayList<Double>):Double
{
    var r=0.0
    var e1=0.0
    var e2=0.0
    var e3=0.0

    for(i in 0 until Lx)
    {
        e1+=(X[i]- Average(LX))*(Y[i]- Average(LY))
        e2+=(X[i]- Average(LX))*(X[i]- Average(LX))
        e3+=(Y[i]- Average(LY))*(Y[i]- Average(LY))
    }
    r=e1/sqrt(e2*e3)
    return r
}

var Lx:Int=0
var LX=ArrayList<Double>()
var LY=ArrayList<Double>()

var DLX=ArrayList<Double>()
var DLY=ArrayList<Double>()
var DLx:Int=0
var DLh:Int=0
var DL_lamda:Double=0.0

var DZX=ArrayList<Double>()
var DZY=ArrayList<Double>()
var DZx:Int=0
var DZp:Int=0
var DZ_lamda:Double=0.0


var ULx:Int=0
var ULX=ArrayList<Double>()
var ULY=ArrayList<Double>()

var ZE_result:String=""
var rr=0
var rrr=0.0

var e=0.0
var a=0.0
var b=0.0
var f_a=0.0
var f_b=0.0







