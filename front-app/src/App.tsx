
import { Admin, Resource, ListGuesser, EditGuesser, ShowGuesser } from 'react-admin';
import { Layout } from './Layout';
import { authProvider } from './api/auth/authProvider';
import dataProviderManager from './api/dataprovider/dataProviderManager';


export const App = () => (
    <Admin
        layout={Layout}
        dataProvider={dataProviderManager}
		authProvider={authProvider}
	>
        <Resource name="animal" list={ListGuesser} edit={EditGuesser} show={ShowGuesser} />
		<Resource name="city" list={ListGuesser} edit={EditGuesser} show={ShowGuesser} />
    </Admin>
);

    