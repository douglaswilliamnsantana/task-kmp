# 🛠️ Task-KMP

![Kotlin](https://img.shields.io/badge/Kotlin-Multiplatform-blueviolet?logo=kotlin)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![Platform](https://img.shields.io/badge/platform-Android%20%7C%20iOS-lightgrey)

> Projeto base para aplicações multiplataforma usando **Kotlin Multiplatform** e **Jetpack Compose Multiplatform**.

---

## 🚀 Sobre o projeto

**Task-KMP** é um projeto desenvolvido com Kotlin Multiplatform, focado em criar uma base compartilhada para aplicações Android e iOS. Utiliza Jetpack Compose Multiplatform para interface e estrutura modular que separa o código comum (commonMain) do específico para cada plataforma (iosMain, jvmMain).

---

### 🔧 Principais recursos:

    . Compartilhamento de lógica entre Android e iOS
    . Suporte a SwiftUI no módulo iOS
    . Estrutura escalável com separação clara entre camadas
    . Ideal para quem busca aprender ou implementar arquitetura multiplataforma com Kotlin

## 📦 Estrutura do projeto

    task-kmp/ 
        |── composeApp/ # Código compartilhado entre plataformas |
        |   └── commonMain/ # Lógica comum (negócio, modelos, etc.) │
        |   └── iosMain/ # Código específico para iOS
        |   └── jvmMain/ # Código específico para Android/Desktop
        |── iosApp/ # Ponto de entrada para o app iOS (SwiftUI)
        |── gradle/ # Configurações de build
        |── build.gradle.kts
        |── settings.gradle.kts


---

## 📱 Tecnologias utilizadas

- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html)
- [Jetpack Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)
- [SwiftUI](https://developer.apple.com/xcode/swiftui/)
- Gradle Kotlin DSL

---

## 🧪 Como executar

### Android
```bash
./gradlew :composeApp:androidApp:installDebug
```
### iOS
```bash
Abra o projeto iosApp no Xcode e execute em um simulador ou dispositivo real.
```