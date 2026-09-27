DSY1102 - Desarrollo Orientado al Objeto
08 - Solución Proyecto Integrador: Sistema de Arriendo de Equipos

Incluye:
- Descontable.java
- Equipo.java
- Notebook.java
- Proyector.java
- RegistroEquipos.java
- Main.java

Decisiones utilizadas en esta solución:
- Equipo implementa Descontable.
- Se asume que 7 días o más aplica un 10% de descuento.
- aplicarDescuento(int dias) retorna el total final a pagar.
- Los recargos por RAM/lúmenes se aplican antes del descuento semanal.
- Se utiliza IllegalArgumentException para valorDia y dias inválidos.
