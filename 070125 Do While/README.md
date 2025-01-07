# Sebastian Munzón

## Sudamericano

### Cuenca, 7 de Enero de 2024

# Marco Teórico

En los ejercicios se uso el bucle **Do While**.

```mermaid
graph TD
    A[Start] --> B[Execute
    Code
    Block]
    B --> C{Condition}
    C -->|True| B
    C -->|False| D[End]

```

# Objetivo

- ## Primer Caso
  - 0 100 5 90 10 80 15 70 20 60 25 50 30 35

```mermaid
  graph TD
    A[Start] --> B[Check aux % 2]
    B -->|0| C[Print x and
     increment x by 5]
    B -->|1| D[Print y and
     decrement y by 10]
    C --> E[Increment aux]
    D --> E
    E --> F{y >= 30?}
    F -->|Yes| B
    F -->|No| G[End]
```

---

- ## Segundo Caso
  - 0 99 1 5 98 2 10 97 3 15 96 4 20 95 5

```mermaid
graph TD
    A[Start] --> B[Check aux % 3]
    B -->|0| C[Print x and
    increment x by 5]
    B -->|1| D[Print y and
    decrement y by 1]
    B -->|2| E[Print z and
    increment z by 1]
    C --> F[Increment aux]
    D --> F
    E --> F
    F --> G{z <= 5?}
    G -->|Yes| B
    G -->|No| H[End]

```

---

- ## Tercer Caso
  - 0 1 1 2 3 5 8 13 21 34

```mermaid
graph TD
    A[Start] --> B[Print x]
    B --> C[Calculate z = x + y]
    C --> D[Set x = y]
    D --> E[Set y = z]
    E --> F{x <= 34?}
    F -->|Yes| B
    F -->|No| G[End]

```
