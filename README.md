# Mudança de Estado do Ícone com ViewModel e Jetpack Compose

Aplicativo Android simples feito com **Kotlin** e **Jetpack Compose** para demonstrar como gerenciar o estado de um ícone usando **ViewModel**.

## 📌 Funcionalidades
- Exibe um ícone na tela.
- Alterna entre dois ícones ao ser clicado.
- Mantém o estado do ícone mesmo após recomposições, graças ao uso de ViewModel.

## 🛠 Tecnologias utilizadas
- Kotlin
- Jetpack Compose
- AndroidX Lifecycle ViewModel
- State Management (`mutableStateOf`)

## 📂 Estrutura
- **IconViewModel** → Gerencia o estado do ícone.
- **MainActivity** → Contém o Composable principal que exibe o ícone.

## Dependências
-implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
-implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
-implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
-implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/marcsant13/MudancaEstadoViewModelCompose.git
