import fakeDataProvider from 'ra-data-fakerest';
import { animalMockData } from '../mock/animal';

export const animalDataProvider = fakeDataProvider(animalMockData);
