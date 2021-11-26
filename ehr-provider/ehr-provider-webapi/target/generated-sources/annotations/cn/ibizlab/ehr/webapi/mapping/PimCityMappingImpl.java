package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimCity;
import cn.ibizlab.ehr.webapi.dto.PimCityDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimCityMappingImpl implements PimCityMapping {

    @Override
    public PimCity toDomain(PimCityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimCity pimCity = new PimCity();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimCity.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimCity.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getProtype() != null ) {
            pimCity.setProtype( dto.getProtype() );
        }
        if ( dto.getPimcityname() != null ) {
            pimCity.setPimcityname( dto.getPimcityname() );
        }
        if ( dto.getEnable() != null ) {
            pimCity.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pimCity.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimcityid() != null ) {
            pimCity.setPimcityid( dto.getPimcityid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimCity.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimCity.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimCity.setUpdatedate( dto.getUpdatedate() );
        }

        return pimCity;
    }

    @Override
    public PimCityDTO toDto(PimCity entity) {
        if ( entity == null ) {
            return null;
        }

        PimCityDTO pimCityDTO = new PimCityDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimCityDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimCityDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getProtype() != null ) {
            pimCityDTO.setProtype( entity.getProtype() );
        }
        if ( entity.getPimcityname() != null ) {
            pimCityDTO.setPimcityname( entity.getPimcityname() );
        }
        if ( entity.getEnable() != null ) {
            pimCityDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pimCityDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimcityid() != null ) {
            pimCityDTO.setPimcityid( entity.getPimcityid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimCityDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimCityDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimCityDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimCityDTO;
    }

    @Override
    public List<PimCity> toDomain(List<PimCityDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimCity> list = new ArrayList<PimCity>( dtoList.size() );
        for ( PimCityDTO pimCityDTO : dtoList ) {
            list.add( toDomain( pimCityDTO ) );
        }

        return list;
    }

    @Override
    public List<PimCityDTO> toDto(List<PimCity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimCityDTO> list = new ArrayList<PimCityDTO>( entityList.size() );
        for ( PimCity pimCity : entityList ) {
            list.add( toDto( pimCity ) );
        }

        return list;
    }
}
