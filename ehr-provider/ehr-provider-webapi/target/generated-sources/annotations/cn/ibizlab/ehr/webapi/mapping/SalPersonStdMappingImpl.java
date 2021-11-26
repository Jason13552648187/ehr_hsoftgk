package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalPersonStd;
import cn.ibizlab.ehr.webapi.dto.SalPersonStdDTO;
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
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalPersonStdMappingImpl implements SalPersonStdMapping {

    @Override
    public SalPersonStd toDomain(SalPersonStdDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalPersonStd salPersonStd = new SalPersonStd();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salPersonStd.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salPersonStd.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMemo() != null ) {
            salPersonStd.setMemo( dto.getMemo() );
        }
        if ( dto.getSalpersonstdname() != null ) {
            salPersonStd.setSalpersonstdname( dto.getSalpersonstdname() );
        }
        if ( dto.getChangereason() != null ) {
            salPersonStd.setChangereason( dto.getChangereason() );
        }
        if ( dto.getBegintime() != null ) {
            salPersonStd.setBegintime( dto.getBegintime() );
        }
        if ( dto.getSaltype() != null ) {
            salPersonStd.setSaltype( dto.getSaltype() );
        }
        if ( dto.getEndtime() != null ) {
            salPersonStd.setEndtime( dto.getEndtime() );
        }
        if ( dto.getPimpersonid() != null ) {
            salPersonStd.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            salPersonStd.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmpostid() != null ) {
            salPersonStd.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmorgid() != null ) {
            salPersonStd.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            salPersonStd.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getSalpersonstdid() != null ) {
            salPersonStd.setSalpersonstdid( dto.getSalpersonstdid() );
        }
        if ( dto.getEnable() != null ) {
            salPersonStd.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            salPersonStd.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salPersonStd.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salPersonStd.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salPersonStd.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmpostname() != null ) {
            salPersonStd.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            salPersonStd.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimpersonname() != null ) {
            salPersonStd.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgname() != null ) {
            salPersonStd.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            salPersonStd.setOrmdutyname( dto.getOrmdutyname() );
        }

        return salPersonStd;
    }

    @Override
    public SalPersonStdDTO toDto(SalPersonStd entity) {
        if ( entity == null ) {
            return null;
        }

        SalPersonStdDTO salPersonStdDTO = new SalPersonStdDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salPersonStdDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salPersonStdDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMemo() != null ) {
            salPersonStdDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSalpersonstdname() != null ) {
            salPersonStdDTO.setSalpersonstdname( entity.getSalpersonstdname() );
        }
        if ( entity.getChangereason() != null ) {
            salPersonStdDTO.setChangereason( entity.getChangereason() );
        }
        if ( entity.getBegintime() != null ) {
            salPersonStdDTO.setBegintime( entity.getBegintime() );
        }
        if ( entity.getSaltype() != null ) {
            salPersonStdDTO.setSaltype( entity.getSaltype() );
        }
        if ( entity.getEndtime() != null ) {
            salPersonStdDTO.setEndtime( entity.getEndtime() );
        }
        if ( entity.getPimpersonid() != null ) {
            salPersonStdDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            salPersonStdDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmpostid() != null ) {
            salPersonStdDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmorgid() != null ) {
            salPersonStdDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            salPersonStdDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getSalpersonstdid() != null ) {
            salPersonStdDTO.setSalpersonstdid( entity.getSalpersonstdid() );
        }
        if ( entity.getEnable() != null ) {
            salPersonStdDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            salPersonStdDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salPersonStdDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salPersonStdDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salPersonStdDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmpostname() != null ) {
            salPersonStdDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            salPersonStdDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimpersonname() != null ) {
            salPersonStdDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgname() != null ) {
            salPersonStdDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            salPersonStdDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return salPersonStdDTO;
    }

    @Override
    public List<SalPersonStd> toDomain(List<SalPersonStdDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalPersonStd> list = new ArrayList<SalPersonStd>( dtoList.size() );
        for ( SalPersonStdDTO salPersonStdDTO : dtoList ) {
            list.add( toDomain( salPersonStdDTO ) );
        }

        return list;
    }

    @Override
    public List<SalPersonStdDTO> toDto(List<SalPersonStd> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalPersonStdDTO> list = new ArrayList<SalPersonStdDTO>( entityList.size() );
        for ( SalPersonStd salPersonStd : entityList ) {
            list.add( toDto( salPersonStd ) );
        }

        return list;
    }
}
