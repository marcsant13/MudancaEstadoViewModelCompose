# Mudança de Estado do Ícone com ViewModel e Jetpack Compose

Aplicativo Android simples feito com **Kotlin** e **Jetpack Compose** para demonstrar como gerenciar o estado de um ícone usando **ViewModel**.

## 📌 Funcionalidades
- Exibe um ícone e caixa de texto na tela, controlando seus estados usando viewmodels.

## 🛠 Tecnologias utilizadas
- Kotlin
- Jetpack Compose
- AndroidX Lifecycle ViewModel
- State Management (`mutableStateOf`)

## 📂 Estrutura
- **IconViewModel** → Gerencia o estado do ícone.
- **TextFieldViewModel** -> Gerencia o estado da caixa de texto
- **MainActivity** → Contém o Composable principal que exibe o ícone e caixa de texto.

## Dependências
-implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
-implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
-implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
-implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/marcsant13/MudancaEstadoViewModelCompose.git
