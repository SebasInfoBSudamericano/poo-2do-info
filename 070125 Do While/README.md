# Sebastian Munzón

## Sudamericano

### Cuenca, 7 de Enero de 2024

# Marco Teórico

En los ejercicios se uso el bucle **Do While**.

```mermaid
graph TD
    A[Inicio] --> B[Ejecutar
    Bloque de Código]
    B --> C{Condición}
    C -->|Verdadero| B
    C -->|Falso| D[Fin]

```

# Objetivo

- ## Primer Caso -> 0 100 5 90 10 80 15 70 20 60 25 50 30 35
  Esta secuencia alterna entre incrementar un valor en 5 y decrementar otro en 10, dependiendo de si la variable auxiliar es par o impar.

```mermaid
  graph TD
    A[Inicio] --> B[Verificar si aux % 2 == 0]
    B -->|Sí| C[Imprimir x e
    incrementar x en 5]
    B -->|No| D[Imprimir y &
    decrementar y en 10]
    C --> E[Incrementar aux]
    D --> E
    E --> F{y >= 30?}
    F -->|Sí| B
    F -->|No| G[Fin]

```

---

- ## Segundo Caso -> 0 99 1 5 98 2 10 97 3 15 96 4 20 95 5

  Esta secuencia realiza tres operaciones según el resto de dividir la variable auxiliar entre 3:

  - Imprime e incrementa x en 5 si el resto es 0.
  - Imprime y decrementa y en 1 si el resto es 1.
  - Imprime e incrementa z en 1 si el resto es 2.
  -

```mermaid
graph TD
    A[Inicio] --> B[Verificar aux % 3]
    B -->|0| C[Imprimir x e
    incrementar x en 5]
    B -->|1| D[Imprimir y &
    decrementar y en 1]
    B -->|2| E[Imprimir z e
    incrementar z en 1]
    C --> F[Incrementar aux]
    D --> F
    E --> F
    F --> G{z <= 5?}
    G -->|Sí| B
    G -->|No| H[Fin]


```

---

- ## Tercer Caso -> 0 1 1 2 3 5 8 13 21 34
  Esta secuencia genera números de Fibonacci sumando los dos valores previos.

```mermaid
graph TD
    A[Inicio] --> B[Imprimir x]
    B --> C[Calcular z = x + y]
    C --> D[Asignar x = y]
    D --> E[Asignar y = z]
    E --> F{x <= 34?}
    F -->|Sí| B
    F -->|No| G[Fin]

```
