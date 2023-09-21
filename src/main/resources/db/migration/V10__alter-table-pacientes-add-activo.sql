alter table vollmed_api.pacientes add activo tinyint;
update vollmed_api.pacientes set pacientes.activo = 1