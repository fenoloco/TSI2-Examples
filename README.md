TSI2-Examples
=============

Ejemplos TSI2

1) Generar con maven desde consola con mvn clean install
2) Copiar el .jar y el .war generados en las carpetas target dentro de la carpeta deploy de JBoss
3) Acceder a http://localhost:8080/TSI2-WEB/index.jsf

===========================================================
Importante:

2) Es mejor usar CDI que usar ManagedBean de JSF ( los mismos van a ser deprecados en un futuro )
3) Para que funcione la inyeccion en un .jar y .war separado es necesario agregar la URL para el lookUP

En el log de Jboss se pueden ver
`````java
  java:global/TSI2-EJB/EJBHelloTSI!com.verifone.tsi2.ejb.EJBHelloTSILocal
	java:app/TSI2-EJB/EJBHelloTSI!com.verifone.tsi2.ejb.EJBHelloTSILocal
	java:module/EJBHelloTSI!com.verifone.tsi2.ejb.EJBHelloTSILocal
	java:global/TSI2-EJB/EJBHelloTSI  
	java:app/TSI2-EJB/EJBHelloTSI   
	java:module/EJBHelloTSI''''
`````

Quedaria asi:
`````java
   @EJB(lookup = "java:global/TSI2-EJB/EJBHelloTSI")
   EJBHelloTSILocal ejb;
`````   
 1) Es necesario indicarle a JBoss que el proyecto .war tiene como dependencia el .jar por tanto se agrega al manifest la siguiente linea:

`````java
   Dependencies: deployment.TSI2-EJB.jar 
`````

Usando maven:

`````xml
<plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.1.1</version>
                <configuration>
                    <archive>
                        <manifestEntries>
                            <Dependencies>deployment.TSI2-EJB.jar</Dependencies>
                        </manifestEntries>
                    </archive>
                </configuration>
            </plugin>
`````

   
