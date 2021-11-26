package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSource;
import cn.ibizlab.ehr.webapi.dto.SalSourceDTO;
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
public class SalSourceMappingImpl implements SalSourceMapping {

    @Override
    public SalSource toDomain(SalSourceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSource salSource = new SalSource();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSource.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSource.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalsourcename() != null ) {
            salSource.setSalsourcename( dto.getSalsourcename() );
        }
        if ( dto.getSource() != null ) {
            salSource.setSource( dto.getSource() );
        }
        if ( dto.getMemo() != null ) {
            salSource.setMemo( dto.getMemo() );
        }
        if ( dto.getEnable() != null ) {
            salSource.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            salSource.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salSource.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salSource.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalsourceid() != null ) {
            salSource.setSalsourceid( dto.getSalsourceid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSource.setUpdatedate( dto.getUpdatedate() );
        }

        return salSource;
    }

    @Override
    public SalSourceDTO toDto(SalSource entity) {
        if ( entity == null ) {
            return null;
        }

        SalSourceDTO salSourceDTO = new SalSourceDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSourceDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSourceDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalsourcename() != null ) {
            salSourceDTO.setSalsourcename( entity.getSalsourcename() );
        }
        if ( entity.getSource() != null ) {
            salSourceDTO.setSource( entity.getSource() );
        }
        if ( entity.getMemo() != null ) {
            salSourceDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getEnable() != null ) {
            salSourceDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            salSourceDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salSourceDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salSourceDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalsourceid() != null ) {
            salSourceDTO.setSalsourceid( entity.getSalsourceid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSourceDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return salSourceDTO;
    }

    @Override
    public List<SalSource> toDomain(List<SalSourceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSource> list = new ArrayList<SalSource>( dtoList.size() );
        for ( SalSourceDTO salSourceDTO : dtoList ) {
            list.add( toDomain( salSourceDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSourceDTO> toDto(List<SalSource> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSourceDTO> list = new ArrayList<SalSourceDTO>( entityList.size() );
        for ( SalSource salSource : entityList ) {
            list.add( toDto( salSource ) );
        }

        return list;
    }
}
