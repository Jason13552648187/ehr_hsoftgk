package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocType;
import cn.ibizlab.ehr.webapi.dto.SocTypeDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocTypeMappingImpl implements SocTypeMapping {

    @Override
    public SocType toDomain(SocTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocType socType = new SocType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSoctypename() != null ) {
            socType.setSoctypename( dto.getSoctypename() );
        }
        if ( dto.getSoctypeid() != null ) {
            socType.setSoctypeid( dto.getSoctypeid() );
        }
        if ( dto.getEnable() != null ) {
            socType.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            socType.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            socType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            socType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            socType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrdervalue() != null ) {
            socType.setOrdervalue( dto.getOrdervalue() );
        }

        return socType;
    }

    @Override
    public SocTypeDTO toDto(SocType entity) {
        if ( entity == null ) {
            return null;
        }

        SocTypeDTO socTypeDTO = new SocTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSoctypename() != null ) {
            socTypeDTO.setSoctypename( entity.getSoctypename() );
        }
        if ( entity.getSoctypeid() != null ) {
            socTypeDTO.setSoctypeid( entity.getSoctypeid() );
        }
        if ( entity.getEnable() != null ) {
            socTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            socTypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            socTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            socTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            socTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrdervalue() != null ) {
            socTypeDTO.setOrdervalue( entity.getOrdervalue() );
        }

        return socTypeDTO;
    }

    @Override
    public List<SocType> toDomain(List<SocTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocType> list = new ArrayList<SocType>( dtoList.size() );
        for ( SocTypeDTO socTypeDTO : dtoList ) {
            list.add( toDomain( socTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<SocTypeDTO> toDto(List<SocType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocTypeDTO> list = new ArrayList<SocTypeDTO>( entityList.size() );
        for ( SocType socType : entityList ) {
            list.add( toDto( socType ) );
        }

        return list;
    }
}
