# Cardápio App - Estudo de RecyclerView

Este projeto é um exemplo de implementação de uma tela de cardápio utilizando a `RecyclerView` no Android. Ele mostra uma lista de produtos com suas imagens, preços e descrições. Ao clicar em um item, é exibido um diálogo com mais detalhes sobre o prato selecionado.

## Funcionalidades

- Exibição de uma lista de pratos utilizando `RecyclerView`.
- Cada item da lista mostra o nome do prato, o preço e a imagem.
- Ao clicar em um prato, abre um diálogo com informações adicionais sobre o prato, como os ingredientes e a descrição.

## Tecnologias Utilizadas

- **Kotlin**
- **RecyclerView**
- **AlertDialog**
- **AndroidX (ViewCompat, WindowInsetsCompat)**
- **Layouts XML**

## Estrutura do Projeto

O projeto é composto por três arquivos principais:

1. **MainActivity.kt**: A `Activity` principal que configura a `RecyclerView`, popula a lista de pratos e gerencia o layout de itens e interações com a interface.
2. **ProdutoAdapter.kt**: O adaptador responsável por configurar a `RecyclerView`, bindando os dados da lista de pratos com os itens da interface.
3. **item_produto.xml**: O layout do item exibido na `RecyclerView`, contendo o nome, preço e imagem do prato.
4. **item_detalhar.xml**: O layout do diálogo que exibe os detalhes do prato selecionado, como a descrição e a lista de ingredientes.

## Como Usar

1. **Clone o repositório**:

    ```bash
    git clone https://github.com/seu-usuario/cardapio-app.git
    ```

2. **Abra o projeto no Android Studio**.

3. **Instale as dependências**.

4. **Execute o aplicativo em um dispositivo Android ou emulador**.

## Imagens do Projeto

### Tela Principal
Exibe a lista de pratos com o nome, preço e imagem.

![Tela Principal](https://github.com/user-attachments/assets/7b620dfa-bd64-403a-b94d-d1744294033d)

### Detalhes do Prato
Ao clicar em um prato, um diálogo exibe mais informações, como ingredientes e descrição.

![Detalhes do Prato](https://github.com/user-attachments/assets/801f0b87-127b-4d98-b467-07e28e7a201a)

## Como Funciona

### MainActivity

Na `MainActivity`, um `RecyclerView` é configurado para exibir uma lista de objetos `Produto`. Cada produto contém informações como nome, valor, ingredientes e uma imagem associada. A interface é configurada para se adaptar ao modo edge-to-edge utilizando `WindowInsetsCompat`.

```kotlin
val produtoList = listOf(
    Produto("Baião de Dois", 25.00, listOf("Calabresa", "Feijão", "Arroz", "Cebola", "Sal"), 
        "O baião de dois é um prato típico do Nordeste brasileiro, especialmente do Ceará, que combina arroz e feijão verde.", 
        R.drawable.baiaodedois),
    Produto("Arroz Feijão", 25.00, listOf("Arroz", "Feijão", "Sal", "Cebola"),
        "O arroz e feijão é uma combinação clássica da culinária brasileira.", 
        R.drawable.arrozfeijao),
    Produto("Macarrão", 25.00, listOf("Macarrão", "Molho", "Carne Moída"),
        "Macarrão com carne moída é uma refeição simples e deliciosa.", 
        R.drawable.macarrao),
    Produto("Feijoada", 25.00, listOf("Feijão", "Carnes de Porco", "Cebola", "Sal"),
        "A feijoada é um prato típico da culinária brasileira.", 
        R.drawable.feijoada)
)




 
