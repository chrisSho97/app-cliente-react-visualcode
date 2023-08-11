const React = require('react');
const { Link, useParams } = require('react-router-dom');
const {useState} = require('react');
const client = require('../client');

const VerAlumnoPage = () => {

    let { id } = useParams();
    const [alumno, setAlumno] = useState({});

    client({
        method: 'GET',
        path: '/api/alumnos/' + id
    }).done(response=>setAlumno(response.entity))


    return (
        <>
            <h1>Ver Alumno</h1>

            <table>
                <tr>
                    <th>Nombre</th>
                    <td>{alumno.nombre}</td>
                </tr>
                <tr>
                    <th>Apellido</th>
                    <td>{alumno.apellido}</td>
                </tr>
                <tr>
                    <th>Turno</th>
                    <td>{alumno.turno}</td>
                </tr>
            </table>

            <Link to="/">Volver</Link>
        </>
    )

}

module.exports = VerAlumnoPage;