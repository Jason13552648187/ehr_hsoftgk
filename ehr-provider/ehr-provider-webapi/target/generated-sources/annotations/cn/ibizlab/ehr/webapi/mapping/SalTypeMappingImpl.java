package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalType;
import cn.ibizlab.ehr.webapi.dto.SalTypeDTO;
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
public class SalTypeMappingImpl implements SalTypeMapping {

    @Override
    public SalType toDomain(SalTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalType salType = new SalType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSaltypename() != null ) {
            salType.setSaltypename( dto.getSaltypename() );
        }
        if ( dto.getSaltypeid() != null ) {
            salType.setSaltypeid( dto.getSaltypeid() );
        }
        if ( dto.getUpdateman() != null ) {
            salType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            salType.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            salType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salType.setCreatedate( dto.getCreatedate() );
        }

        return salType;
    }

    @Override
    public SalTypeDTO toDto(SalType entity) {
        if ( entity == null ) {
            return null;
        }

        SalTypeDTO salTypeDTO = new SalTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSaltypename() != null ) {
            salTypeDTO.setSaltypename( entity.getSaltypename() );
        }
        if ( entity.getSaltypeid() != null ) {
            salTypeDTO.setSaltypeid( entity.getSaltypeid() );
        }
        if ( entity.getUpdateman() != null ) {
            salTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            salTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            salTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salTypeDTO.setCreatedate( entity.getCreatedate() );
        }

        return salTypeDTO;
    }

    @Override
    public List<SalType> toDomain(List<SalTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalType> list = new ArrayList<SalType>( dtoList.size() );
        for ( SalTypeDTO salTypeDTO : dtoList ) {
            list.add( toDomain( salTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<SalTypeDTO> toDto(List<SalType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalTypeDTO> list = new ArrayList<SalTypeDTO>( entityList.size() );
        for ( SalType salType : entityList ) {
            list.add( toDto( salType ) );
        }

        return list;
    }
}
