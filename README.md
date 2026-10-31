# base-api

Este proyecto sirve como base para nuevos proyectos. Ya está preparado para sentarse a programar o a 
vibe-codear, o lo que sea que hagan. Va a estar mentenido y verificada cada librería para evitar líos de seguridad (cada vez que me sea posible, o haganlo ustedes).

### Coverage

 Por defecto,para pasar los test con 0% basta, cada uno cambiará por lo que considere estrictamente necesario, obviamente
que este valor no puede ser 0 cuando tengas tu proyecto.

```
 <configuration>
          <rules>
            <rule>
              <element>BUNDLE</element>
              <limits>
                <limit>
                  <counter>LINE</counter>
                  <value>COVEREDRATIO</value>
                  <minimum>0.00</minimum>
                </limit>
              </limits>
            </rule>
          </rules>
        </configuration>
```
