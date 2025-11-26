import { Component } from '@angular/core';

@Component({
  selector: 'app-ejercicios',
  standalone: true,
  imports: [],
  templateUrl: './ejercicios.component.html',
  styles: ``
})
export class EjerciciosComponent {
  ejercicio01(): void {
    let nombre: string = "Ana";
    let edad: number = 25;
    let esEstudiante: boolean = true;
    let ciudad: null = null;
    let pais: undefined = undefined;

    console.log(`Nombre: ${nombre}`);
    console.log(`Edad: ${edad}`);
    console.log(`Es estudiante: ${esEstudiante}`);
    console.log(`Ciudad: ${ciudad}`);
    console.log(`País: ${pais}`);

  }
  ejercicio02(): void {
    // Ejercicio 2: Uso de let, const y var
    let contador: number = 0; // Se puede modificar
    const maxIntentos: number = 5; // No se puede modificar
    
    var mensaje: string = "Hola"; // Se puede modificar

    contador += 1;
    console.log(`Contador: ${contador}`); // Imprime: Contador: 1
    console.log(`Máximos intentos: ${maxIntentos}`); // Imprime: Máximos intentos: 5
    console.log(`Mensaje: ${mensaje}`); // Imprime: Mensaje: Hola

    // Intentamos cambiar el valor de 'maxIntentos' (esto generará un error en tiempo de compilación)
    // maxIntentos = 10; // Descomentar esta línea generará un error

    // Modificando la variable 'mensaje'
    mensaje = "Hola, mundo!";
    console.log(`Mensaje actualizado: ${mensaje}`); // Imprime: Mensaje actualizado: Hola, mundo!


  }
  ejercicio03(): void {
    // Ejercicio 1: Verificar si un Número es Par o Impar
    let numero: number = 7;

    if (numero % 2 === 0) {
      console.log(`${numero} es un número par.`);
    } else {
      console.log(`${numero} es un número impar.`);
    }


  }
  ejercicio04(): void {
    // Ejercicio 4: Verificar la Edad para Acceso a Contenido
    let edad: number = 20;

    if (edad >= 18) {
      console.log(`Eres mayor de edad.`);
    } else {
      console.log(`Eres menor de edad.`);
    }

  }
  ejercicio05(): void {
    // Ejercicio 5: Comprobar el Estado de un Pedido
    let estadoPedido: string = "enviado";

    if (estadoPedido === "enviado") {
      console.log(`Tu pedido ha sido enviado.`);
    } else if (estadoPedido === "pendiente") {
      console.log(`Tu pedido está pendiente.`);
    } else if (estadoPedido === "cancelado") {
      console.log(`Tu pedido ha sido cancelado.`);
    } else {
      console.log(`Estado del pedido no reconocido.`);
    }

  }
  ejercicio06(): void {
    // Ejercicio 6: Imprimir Números del 1 al 5
    console.log("Números del 1 al 5:");

    for (let i = 1; i <= 5; i++) {
      console.log(i);
    }

  }
  ejercicio07(): void {
    // Ejercicio 7: Sumar Números del 1 al 10
    let suma: number = 0;
    let contador: number = 1;

    while (contador <= 10) {
      suma += contador;
      contador++;
    }

    console.log(`La suma de los números del 1 al 10 es: ${suma}`);

  }
  ejercicio08(): void {
    // Ejercicio 3: Imprimir Elementos de un Array
    let frutas: string[] = ["Manzana", "Banana", "Naranja", "Pera"];

    console.log("Lista de frutas:");

    for (let fruta of frutas) {
      console.log(fruta);
    }


  }

  ejercicio09(): void {
    // Declaración inicial del array de ciudades
    let ciudades: string[] = ["Madrid", "Barcelona", "Valencia", "Sevilla"];

    console.log("Array inicial:", ciudades);

    // 1. Insertar una nueva ciudad en el array
    // Añadir "Bilbao" al final del array
    ciudades.push("Bilbao");
    console.log("Después de insertar 'Bilbao':", ciudades);

    // 2. Modificar una ciudad existente en el array
    // Cambiar "Barcelona" por "Zaragoza" (índice 1)
    ciudades[1] = "Zaragoza";
    console.log("Después de modificar 'Barcelona' por 'Zaragoza':", ciudades);

    // 3. Eliminar una ciudad del array
    // Eliminar "Valencia" (índice 2)
    ciudades.splice(2, 1);  // Elimina 1 elemento en el índice 2
    console.log("Después de eliminar 'Valencia':", ciudades);

    // 4. Consultar (buscar) una ciudad en el array
    // Verificar si "Sevilla" está en el array
    let indexSevilla = ciudades.indexOf("Sevilla");
    if (indexSevilla !== -1) {
      console.log(`'Sevilla' está en el array en el índice ${indexSevilla}.`);
    } else {
      console.log("'Sevilla' no está en el array.");
    }

    // 5. Insertar una nueva ciudad en una posición específica
    // Insertar "Granada" en el índice 2
    ciudades.splice(2, 0, "Granada");
    console.log("Después de insertar 'Granada' en la posición 2:", ciudades);

    // Imprimir el array final
    console.log("Array final:", ciudades);

  }


}
