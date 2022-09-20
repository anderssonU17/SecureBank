/*
Nombre: SECURE BANK
Seccion: IN5CV
Fecha de Creacion: 04/09/2022
Fecha de modificación : 08/09/2022
*/

Drop database if exists DBSecureBank;
Create database DBSecureBank;

Use DBSecureBank;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA CLIENTE ---------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------
Create table Cliente(
	idCliente int not null,
    dpi varchar(13) not null, 
    nombresCliente varchar (100) not null,
    apellidosCliente varchar (100) not null,
    direccion varchar (50) not null,
    telefono varchar(8) not null, 
    sexo varchar (1) not null,
    nacionalidad varchar (25) not null,
    primary key PK_idCliente (idCliente)
);

insert into Cliente(idCliente, dpi, nombresCliente, apellidosCliente, direccion, telefono, sexo, nacionalidad)
	values (100, '122356984','Enner', 'Salazar', 'San Cristobal, Mixco','32077606', 'M', 'Guatemala');
insert into Cliente(idCliente, dpi, nombresCliente, apellidosCliente, direccion, telefono, sexo, nacionalidad)
	values (101, '789564123', 'Andersson', 'Urrea', 'Cancún', '47342291', 'M', 'México');
insert into Cliente(idCliente, dpi, nombresCliente, apellidosCliente, direccion, telefono, sexo, nacionalidad)
	values (102, '897564123', 'Edgar', 'Gomez', 'Zona 3', '37432642', 'M', 'Guatemala');

select * from Cliente;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA USUARIO --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------

Create table Usuario(
	idUsuario int not null,
    nombreUsuario varchar (25) not null,
    idCliente int not null,
    contraseña varchar (25) not null,
    correo varchar(100) not null,
    fechaCreacion date not null,
    primary key PK_idUsuario (idUsuario),
    constraint FK_Usuario_Cliente foreign key (idCliente)
		references Cliente(idCliente)
);

insert into Usuario(idUsuario, nombreUsuario, idCliente, contraseña, correo, fechaCreacion)
	values (900, 'esalazar', 100, '@Ess585', 'esalazar-2021585@kinal.edu.gt', '2021-05-15');
insert into Usuario(idUsuario, nombreUsuario, idCliente, contraseña, correo, fechaCreacion)
	values (901, 'aurrea', 101, '123', 'aurrea-2019284@kinal.edu.gt', '2019-01-14');
insert into Usuario(idUsuario, nombreUsuario, idCliente, contraseña, correo, fechaCreacion)
	values (902, 'abalcarcel', 102, '3GomeZ.400', 'egomez-2021400@kinal.edu.gt', '2021-8-11');

select * from Usuario;
select * from Usuario where nombreUsuario = 'aurrea' and contraseña = 123; 

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA MONEDA --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------

Create table Moneda(
	idMoneda int not null,
    nombreDeMoneda varchar (45) not null,
    primary key PK_idMoneda (idMoneda)
);

insert into Moneda(idMoneda, nombreDeMoneda)
	values (500, 'Quetzal');
insert into Moneda(idMoneda, nombreDeMoneda)
	values (501, 'Dólar');
insert into Moneda(idMoneda, nombreDeMoneda)
	values (502, 'Euro');
    
		select * from Moneda;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA TIPODECUENTA --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------

Create table TipoDeCuenta(
	idTipoCuenta int not null, 
    tipoCuenta varchar (45) not null,
    primary key PK_idTipoDeCuenta (idTipoCuenta)
);

insert into TipoDeCuenta(idTipoCuenta, tipoCuenta)
	values (600, 'Cuenta de ahorro');
insert into TipoDeCuenta(idTipoCuenta, tipoCuenta)
	values (601, 'Cuenta Corriente');
insert into TipoDeCuenta(idTipoCuenta, tipoCuenta)
	values (602, 'Cuenta infantil');
    
		select * from TipoDeCuenta;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA CUENTA --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------

Create table Cuenta(
	idCuenta int not null,
    idCliente  int not null, -- LLAVE FORANEA
    idTipoCuenta int not null, -- LLAVE FORANEA
    saldo varchar (45) not null,
    primary key PK_idCuenta (idCuenta),
	constraint FK_Cuenta_Cliente foreign key (idCliente)
		references Cliente (idCliente),
	constraint FK_Cuenta_TipoDeCuenta foreign key (idTipoCuenta)
		references TipoDeCuenta (idTipoCuenta)
);

insert into Cuenta(idCuenta, idCliente, idTipoCuenta, saldo)
	values (700, 100, 600, 8000);
insert into Cuenta(idCuenta, idCliente, idTipoCuenta, saldo)
	values (701, 101, 601, 2500);
insert into Cuenta(idCuenta, idCliente, idTipoCuenta, saldo)
	values (702, 102, 602, 12000);
    
select * from Cuenta;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA PRESTAMO --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------


Create table Prestamo(
	idPrestamo int not null auto_increment, 
    idCliente int not null, 
    plazoMeses varchar(50) not null,
    montoPrestamo int not null,
    fechaPrestamo date not null,
    primary key PK_idPrestamo (idPrestamo), 
    constraint FK_Prestamo_Cliente foreign key(idCliente)
    references Cliente(idCliente)
);

insert into Prestamo(idCliente, plazoMeses, montoPrestamo, fechaPrestamo)
values (100, '6 meses', 1000, now()); 
insert into Prestamo(idCliente, plazoMeses, montoPrestamo, fechaPrestamo)
values(101, '2 meses', 2500, now());
insert into Prestamo(idCliente, plazoMeses, montoPrestamo, fechaPrestamo)
values(102, '12 meses', 5000, now());

select * from Prestamo; 
-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA PROVEEDOR --------------------------------------------------------
-- -------------------------------------------------------------------------------------------------------------------------------

Create table Proveedor(
	nitProveedor varchar(15) not null,
    nombreProveedor varchar (50) not null, 
    primary key PK_idProveedor (nitProveedor)
);

insert into Proveedor(nitProveedor, nombreProveedor)
	values('458795', 'Agencias Wy');
insert into Proveedor(nitProveedor, nombreProveedor)
	values('4564562', 'Banco Industrial');
insert into Proveedor (nitProveedor, nombreProveedor)
	values('45822', 'Banco Agromercantil');

select * from Proveedor;

-- -------------------------------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------- TABLA PAGOSERVICIO --------------------------------------------------------
-- --------------------------------------------------------------------------------------------------------------------------------
        
Create table PagoServicio(
	identificadorPago int not null auto_increment,
    idCliente int not null, -- FORANEA
    nitProveedor varchar (15) not null, -- FORANEA
    Monto varchar (45) not null, 
    idMoneda int not null, -- FORANEA
    fechaYHora date not null,
    primary key PK_identificadorPago(identificadorPago),
    constraint FK_PagoServicio_Cliente foreign key (idCliente)
		references Cliente (idCliente),
	constraint FK_PagoServicio_Proveedor foreign key (nitProveedor)
		references Proveedor (nitProveedor),
	constraint FK_PagoServicio_Moneda foreign key(idMoneda)
		references Moneda (idMoneda)
);

insert into PagoServicio(idCliente, nitProveedor, Monto, idMoneda, fechaYHora)
	values (100, '458795', 25000, 500, now());
insert into PagoServicio(idCliente, nitProveedor, Monto, idMoneda, fechaYHora)
	values (101, '4564562', 150000, 501, now());
insert into PagoServicio(idCliente, nitProveedor, Monto, idMoneda, fechaYHora)
	values (102, '45822', 15000, 502, now());
    
select * from PagoServicio;
















 