# Implementación de QuickSort

Este proyecto presenta una implementación del algoritmo QuickSort, optimizado para el manejo eficiente de grandes volúmenes de datos. Utiliza la estrategia "Mediana de 3" para la selección del pivote, lo cual mejora la estabilidad y rendimiento del algoritmo. Además, incorpora concurrencia mediante el uso de `ForkJoinPool` en Java, permitiendo aprovechar las ventajas de los sistemas multi-núcleo.

Las pruebas realizadas demuestran mejoras significativas en el rendimiento, especialmente en configuraciones de hardware con múltiples núcleos. Sin embargo, se identificaron algunas limitaciones en el manejo de arreglos previamente ordenados, lo cual es una característica inherente a QuickSort.

Todo el código desarrollado en este proyecto es de elaboración personal y se basa en los conceptos y técnicas estudiados en clase. Esto refleja un cierto grado de comprensión de las técnicas avanzadas de ordenación y programación concurrente.

## Referencias

- Learn While Learning. [@learnwhilelearning]. (19 de mayo de 2024). [Quick Sort Visual Explanation](https://www.instagram.com/p/C7JsPTuP1Um/) [Video]. Instagram.
- Numerentur.org (s.f). [QuickSort](https://numerentur.org/quicksort/)
- TecnoDigital (5 de julio de 2023) [Método de Quicksort en C y Java: Una Guía Completa](https://informatecdigital.com/algoritmos/metodo-de-quicksort-en-c-y-java-una-guia-complet)
