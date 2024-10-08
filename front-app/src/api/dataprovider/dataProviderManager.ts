import { combineDataProviders } from 'react-admin';
import { animalDataProvider } from './animalDataProvider';
import { cityDataProvider } from './cityDataProvider';

const dataProviderManager =  combineDataProviders((resource)=>{
    switch (resource){
        case 'animal':
            return animalDataProvider
        case 'city':
            return cityDataProvider
        default:
            throw new Error(`Unknown resource: ${resource}`)
    }
})

export default dataProviderManager
