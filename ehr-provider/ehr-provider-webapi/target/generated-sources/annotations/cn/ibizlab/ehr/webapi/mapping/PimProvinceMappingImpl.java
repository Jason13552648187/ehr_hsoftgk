package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimProvince;
import cn.ibizlab.ehr.webapi.dto.PimProvinceDTO;
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
public class PimProvinceMappingImpl implements PimProvinceMapping {

    @Override
    public PimProvince toDomain(PimProvinceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimProvince pimProvince = new PimProvince();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimProvince.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimProvince.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimprovincename() != null ) {
            pimProvince.setPimprovincename( dto.getPimprovincename() );
        }
        if ( dto.getEnable() != null ) {
            pimProvince.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimProvince.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimprovinceid() != null ) {
            pimProvince.setPimprovinceid( dto.getPimprovinceid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimProvince.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimProvince.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimProvince.setUpdatedate( dto.getUpdatedate() );
        }

        return pimProvince;
    }

    @Override
    public PimProvinceDTO toDto(PimProvince entity) {
        if ( entity == null ) {
            return null;
        }

        PimProvinceDTO pimProvinceDTO = new PimProvinceDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimProvinceDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimProvinceDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimprovincename() != null ) {
            pimProvinceDTO.setPimprovincename( entity.getPimprovincename() );
        }
        if ( entity.getEnable() != null ) {
            pimProvinceDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimProvinceDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimprovinceid() != null ) {
            pimProvinceDTO.setPimprovinceid( entity.getPimprovinceid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimProvinceDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimProvinceDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimProvinceDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimProvinceDTO;
    }

    @Override
    public List<PimProvince> toDomain(List<PimProvinceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimProvince> list = new ArrayList<PimProvince>( dtoList.size() );
        for ( PimProvinceDTO pimProvinceDTO : dtoList ) {
            list.add( toDomain( pimProvinceDTO ) );
        }

        return list;
    }

    @Override
    public List<PimProvinceDTO> toDto(List<PimProvince> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimProvinceDTO> list = new ArrayList<PimProvinceDTO>( entityList.size() );
        for ( PimProvince pimProvince : entityList ) {
            list.add( toDto( pimProvince ) );
        }

        return list;
    }
}
