package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimGwType;
import cn.ibizlab.ehr.webapi.dto.PimGwTypeDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimGwTypeMappingImpl implements PimGwTypeMapping {

    @Override
    public PimGwType toDomain(PimGwTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimGwType pimGwType = new PimGwType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimGwType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimGwType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimgwtypename() != null ) {
            pimGwType.setPimgwtypename( dto.getPimgwtypename() );
        }
        if ( dto.getGwlx() != null ) {
            pimGwType.setGwlx( dto.getGwlx() );
        }
        if ( dto.getEnable() != null ) {
            pimGwType.setEnable( dto.getEnable() );
        }
        if ( dto.getOrdervalue() != null ) {
            pimGwType.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getCreatedate() != null ) {
            pimGwType.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimgwtypeid() != null ) {
            pimGwType.setPimgwtypeid( dto.getPimgwtypeid() );
        }
        if ( dto.getCreateman() != null ) {
            pimGwType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pimGwType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimGwType.setUpdatedate( dto.getUpdatedate() );
        }

        return pimGwType;
    }

    @Override
    public PimGwTypeDTO toDto(PimGwType entity) {
        if ( entity == null ) {
            return null;
        }

        PimGwTypeDTO pimGwTypeDTO = new PimGwTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimGwTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimGwTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimgwtypename() != null ) {
            pimGwTypeDTO.setPimgwtypename( entity.getPimgwtypename() );
        }
        if ( entity.getGwlx() != null ) {
            pimGwTypeDTO.setGwlx( entity.getGwlx() );
        }
        if ( entity.getEnable() != null ) {
            pimGwTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrdervalue() != null ) {
            pimGwTypeDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getCreatedate() != null ) {
            pimGwTypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimgwtypeid() != null ) {
            pimGwTypeDTO.setPimgwtypeid( entity.getPimgwtypeid() );
        }
        if ( entity.getCreateman() != null ) {
            pimGwTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pimGwTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimGwTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimGwTypeDTO;
    }

    @Override
    public List<PimGwType> toDomain(List<PimGwTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimGwType> list = new ArrayList<PimGwType>( dtoList.size() );
        for ( PimGwTypeDTO pimGwTypeDTO : dtoList ) {
            list.add( toDomain( pimGwTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimGwTypeDTO> toDto(List<PimGwType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimGwTypeDTO> list = new ArrayList<PimGwTypeDTO>( entityList.size() );
        for ( PimGwType pimGwType : entityList ) {
            list.add( toDto( pimGwType ) );
        }

        return list;
    }
}
