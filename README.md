Este projeto foi construído para praticar conceitos de Java voltados ao mercado corporativo:

- BigDecimal: Cálculos de impostos (15%) e multiplicadores de classe sem perda de centavos, utilizando RoundingMode.HALF_UP.
- Regex (Expressões Regulares): Validação de passaportes internacionais seguindo o padrão de 2 letras e 6 números (^[A-Za-z]{2}\\d{6}$).
- Enums: Uso de Enums com construtores e atributos para gerenciar multiplicadores de preços.
- Tratamento de Exceções: Implementação de Checked Exceptions personalizadas (PassaporteInvalidoException) para controle de fluxo e segurança.
- Records: Utilização de estruturas imutáveis para transporte de dados de venda.
- Geração Aleatória: Uso de ThreadLocalRandom para sorteio de assentos e portões de embarque.

🛠️ Funcionalidades
- Validação de Identidade: Verifica se o passaporte do passageiro é válido antes de emitir o bilhete.
- Cálculo Dinâmico: Aplica taxas baseadas na categoria (Econômica, Executiva ou Primeira Classe).
- Detalhamento de Custos: Exibe um extrato transparente com preço base, impostos calculados e taxas fixas.
- Acomodação: Sorteia automaticamente o portão de embarque e o assento do passageiro (1 a 100).

💻 Exemplo de Execução

--- DETALHAMENTO DE CUSTOS ---

Passagem Base (PRIMEIRA_CLASSE): R$ 7502.50

Impostos (15%): R$ 1125.38

Taxa Fixa: R$ 2.30

TOTAL A PAGAR: R$ 8630.18

--- Bilhete emitido, obrigado pela preferência!! ---

Passaporte: BR987654

Classe escolhida: PRIMEIRA_CLASSE

Embarque: Portão 5

Assento: 79
