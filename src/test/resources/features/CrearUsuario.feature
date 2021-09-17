@Regresion
Feature: Automation Practice

  @CrearUsuario
  Scenario Outline: crear usuario
    Given ingreso en la web automationpractice
    When diligencio la informacion del registro
      | <Mail> | <Nombres> | <Apellidos> | <Clave> | <DiaNacimiento> | <MesNacimiento> | <AñoNacimiento> | <Compañia> | <Direccion> | <Ciudad> | <Estado> | <CodigoPostal> | <Informacion> | <Celular> |
    Then verifico el resultado de la creacion
      | <Nombres> | <Apellidos> |

    Examples: 
      | Mail                 | Nombres | Apellidos | Clave     | DiaNacimiento | MesNacimiento | AñoNacimiento | Compañia | Direccion  | Ciudad   | Estado | CodigoPostal | Informacion         | Celular    |
      | viviana9@hotmail.com | Marcela | Lombana   | 12345678+ |             2 |             2 |          1990 | VMSHOES  | El Poblado | Medellin |     22 |        22500 | registro de usuario | 3187496212 |

  @UsuarioExiste
  Scenario Outline: intentar crear usuario existente
    Given ingreso en la web automationpractice
    When ingreso mail para el registro <Mail>
    Then verifico el resultado <MensajeEsperado>

    Examples: 
      | Mail                   | MensajeEsperado                                                                                                        |
      | "viviana5@hotmail.com" | "An account using this email address has already been registered. Please enter a valid password or request a new one." |
