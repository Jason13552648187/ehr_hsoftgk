package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalStdzx;
import cn.ibizlab.ehr.webapi.dto.SalStdzxDTO;
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
public class SalStdzxMappingImpl implements SalStdzxMapping {

    @Override
    public SalStdzx toDomain(SalStdzxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalStdzx salStdzx = new SalStdzx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salStdzx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salStdzx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalstdzxname() != null ) {
            salStdzx.setSalstdzxname( dto.getSalstdzxname() );
        }
        if ( dto.getMemo() != null ) {
            salStdzx.setMemo( dto.getMemo() );
        }
        if ( dto.getBz() != null ) {
            salStdzx.setBz( dto.getBz() );
        }
        if ( dto.getQy() != null ) {
            salStdzx.setQy( dto.getQy() );
        }
        if ( dto.getOrmdutyid() != null ) {
            salStdzx.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgid() != null ) {
            salStdzx.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            salStdzx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salStdzx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            salStdzx.setEnable( dto.getEnable() );
        }
        if ( dto.getSalstdzxid() != null ) {
            salStdzx.setSalstdzxid( dto.getSalstdzxid() );
        }
        if ( dto.getCreateman() != null ) {
            salStdzx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salStdzx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            salStdzx.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            salStdzx.setOrmdutyname( dto.getOrmdutyname() );
        }

        return salStdzx;
    }

    @Override
    public SalStdzxDTO toDto(SalStdzx entity) {
        if ( entity == null ) {
            return null;
        }

        SalStdzxDTO salStdzxDTO = new SalStdzxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salStdzxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salStdzxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalstdzxname() != null ) {
            salStdzxDTO.setSalstdzxname( entity.getSalstdzxname() );
        }
        if ( entity.getMemo() != null ) {
            salStdzxDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getBz() != null ) {
            salStdzxDTO.setBz( entity.getBz() );
        }
        if ( entity.getQy() != null ) {
            salStdzxDTO.setQy( entity.getQy() );
        }
        if ( entity.getOrmdutyid() != null ) {
            salStdzxDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgid() != null ) {
            salStdzxDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            salStdzxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salStdzxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            salStdzxDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSalstdzxid() != null ) {
            salStdzxDTO.setSalstdzxid( entity.getSalstdzxid() );
        }
        if ( entity.getCreateman() != null ) {
            salStdzxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salStdzxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            salStdzxDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            salStdzxDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return salStdzxDTO;
    }

    @Override
    public List<SalStdzx> toDomain(List<SalStdzxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalStdzx> list = new ArrayList<SalStdzx>( dtoList.size() );
        for ( SalStdzxDTO salStdzxDTO : dtoList ) {
            list.add( toDomain( salStdzxDTO ) );
        }

        return list;
    }

    @Override
    public List<SalStdzxDTO> toDto(List<SalStdzx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalStdzxDTO> list = new ArrayList<SalStdzxDTO>( entityList.size() );
        for ( SalStdzx salStdzx : entityList ) {
            list.add( toDto( salStdzx ) );
        }

        return list;
    }
}
