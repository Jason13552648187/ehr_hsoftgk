package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacLeaveDetail;
import cn.ibizlab.ehr.webapi.dto.VacLeaveDetailDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacLeaveDetailMappingImpl implements VacLeaveDetailMapping {

    @Override
    public VacLeaveDetail toDomain(VacLeaveDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacLeaveDetail vacLeaveDetail = new VacLeaveDetail();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacLeaveDetail.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacLeaveDetail.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getHyzk() != null ) {
            vacLeaveDetail.setHyzk( dto.getHyzk() );
        }
        if ( dto.getVacleavedetailname() != null ) {
            vacLeaveDetail.setVacleavedetailname( dto.getVacleavedetailname() );
        }
        if ( dto.getQjzl() != null ) {
            vacLeaveDetail.setQjzl( dto.getQjzl() );
        }
        if ( dto.getJhjssxw() != null ) {
            vacLeaveDetail.setJhjssxw( dto.getJhjssxw() );
        }
        if ( dto.getJhkssxw() != null ) {
            vacLeaveDetail.setJhkssxw( dto.getJhkssxw() );
        }
        if ( dto.getNjsy() != null ) {
            vacLeaveDetail.setNjsy( dto.getNjsy() );
        }
        if ( dto.getSjjssj() != null ) {
            vacLeaveDetail.setSjjssj( dto.getSjjssj() );
        }
        if ( dto.getSjts() != null ) {
            vacLeaveDetail.setSjts( dto.getSjts() );
        }
        if ( dto.getTqlx() != null ) {
            vacLeaveDetail.setTqlx( dto.getTqlx() );
        }
        if ( dto.getSjkssj() != null ) {
            vacLeaveDetail.setSjkssj( dto.getSjkssj() );
        }
        if ( dto.getFj() != null ) {
            vacLeaveDetail.setFj( dto.getFj() );
        }
        if ( dto.getSjjssxw() != null ) {
            vacLeaveDetail.setSjjssxw( dto.getSjjssxw() );
        }
        if ( dto.getJhkssj() != null ) {
            vacLeaveDetail.setJhkssj( dto.getJhkssj() );
        }
        if ( dto.getSjkssxw() != null ) {
            vacLeaveDetail.setSjkssxw( dto.getSjkssxw() );
        }
        if ( dto.getJhts() != null ) {
            vacLeaveDetail.setJhts( dto.getJhts() );
        }
        if ( dto.getBz() != null ) {
            vacLeaveDetail.setBz( dto.getBz() );
        }
        if ( dto.getTips() != null ) {
            vacLeaveDetail.setTips( dto.getTips() );
        }
        if ( dto.getJhjssj() != null ) {
            vacLeaveDetail.setJhjssj( dto.getJhjssj() );
        }
        if ( dto.getPimpersonid() != null ) {
            vacLeaveDetail.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getState() != null ) {
            vacLeaveDetail.setState( dto.getState() );
        }
        if ( dto.getVacleavedetailid() != null ) {
            vacLeaveDetail.setVacleavedetailid( dto.getVacleavedetailid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacLeaveDetail.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSjqjjs() != null ) {
            vacLeaveDetail.setSjqjjs( dto.getSjqjjs() );
        }
        if ( dto.getCreateman() != null ) {
            vacLeaveDetail.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacLeaveDetail.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getJhqjks() != null ) {
            vacLeaveDetail.setJhqjks( dto.getJhqjks() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacLeaveDetail.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSjqjks() != null ) {
            vacLeaveDetail.setSjqjks( dto.getSjqjks() );
        }
        if ( dto.getJhqjjs() != null ) {
            vacLeaveDetail.setJhqjjs( dto.getJhqjjs() );
        }
        if ( dto.getPimpersonname() != null ) {
            vacLeaveDetail.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacLeaveDetail.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            vacLeaveDetail.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacLeaveDetail.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            vacLeaveDetail.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return vacLeaveDetail;
    }

    @Override
    public VacLeaveDetailDTO toDto(VacLeaveDetail entity) {
        if ( entity == null ) {
            return null;
        }

        VacLeaveDetailDTO vacLeaveDetailDTO = new VacLeaveDetailDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacLeaveDetailDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacLeaveDetailDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getHyzk() != null ) {
            vacLeaveDetailDTO.setHyzk( entity.getHyzk() );
        }
        if ( entity.getVacleavedetailname() != null ) {
            vacLeaveDetailDTO.setVacleavedetailname( entity.getVacleavedetailname() );
        }
        if ( entity.getQjzl() != null ) {
            vacLeaveDetailDTO.setQjzl( entity.getQjzl() );
        }
        if ( entity.getJhjssxw() != null ) {
            vacLeaveDetailDTO.setJhjssxw( entity.getJhjssxw() );
        }
        if ( entity.getJhkssxw() != null ) {
            vacLeaveDetailDTO.setJhkssxw( entity.getJhkssxw() );
        }
        if ( entity.getNjsy() != null ) {
            vacLeaveDetailDTO.setNjsy( entity.getNjsy() );
        }
        if ( entity.getSjjssj() != null ) {
            vacLeaveDetailDTO.setSjjssj( entity.getSjjssj() );
        }
        if ( entity.getSjts() != null ) {
            vacLeaveDetailDTO.setSjts( entity.getSjts() );
        }
        if ( entity.getTqlx() != null ) {
            vacLeaveDetailDTO.setTqlx( entity.getTqlx() );
        }
        if ( entity.getSjkssj() != null ) {
            vacLeaveDetailDTO.setSjkssj( entity.getSjkssj() );
        }
        if ( entity.getFj() != null ) {
            vacLeaveDetailDTO.setFj( entity.getFj() );
        }
        if ( entity.getSjjssxw() != null ) {
            vacLeaveDetailDTO.setSjjssxw( entity.getSjjssxw() );
        }
        if ( entity.getJhkssj() != null ) {
            vacLeaveDetailDTO.setJhkssj( entity.getJhkssj() );
        }
        if ( entity.getSjkssxw() != null ) {
            vacLeaveDetailDTO.setSjkssxw( entity.getSjkssxw() );
        }
        if ( entity.getJhts() != null ) {
            vacLeaveDetailDTO.setJhts( entity.getJhts() );
        }
        if ( entity.getBz() != null ) {
            vacLeaveDetailDTO.setBz( entity.getBz() );
        }
        if ( entity.getTips() != null ) {
            vacLeaveDetailDTO.setTips( entity.getTips() );
        }
        if ( entity.getJhjssj() != null ) {
            vacLeaveDetailDTO.setJhjssj( entity.getJhjssj() );
        }
        if ( entity.getPimpersonid() != null ) {
            vacLeaveDetailDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getState() != null ) {
            vacLeaveDetailDTO.setState( entity.getState() );
        }
        if ( entity.getVacleavedetailid() != null ) {
            vacLeaveDetailDTO.setVacleavedetailid( entity.getVacleavedetailid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacLeaveDetailDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSjqjjs() != null ) {
            vacLeaveDetailDTO.setSjqjjs( entity.getSjqjjs() );
        }
        if ( entity.getCreateman() != null ) {
            vacLeaveDetailDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacLeaveDetailDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getJhqjks() != null ) {
            vacLeaveDetailDTO.setJhqjks( entity.getJhqjks() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacLeaveDetailDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSjqjks() != null ) {
            vacLeaveDetailDTO.setSjqjks( entity.getSjqjks() );
        }
        if ( entity.getJhqjjs() != null ) {
            vacLeaveDetailDTO.setJhqjjs( entity.getJhqjjs() );
        }
        if ( entity.getPimpersonname() != null ) {
            vacLeaveDetailDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacLeaveDetailDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            vacLeaveDetailDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacLeaveDetailDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            vacLeaveDetailDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return vacLeaveDetailDTO;
    }

    @Override
    public List<VacLeaveDetail> toDomain(List<VacLeaveDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacLeaveDetail> list = new ArrayList<VacLeaveDetail>( dtoList.size() );
        for ( VacLeaveDetailDTO vacLeaveDetailDTO : dtoList ) {
            list.add( toDomain( vacLeaveDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<VacLeaveDetailDTO> toDto(List<VacLeaveDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacLeaveDetailDTO> list = new ArrayList<VacLeaveDetailDTO>( entityList.size() );
        for ( VacLeaveDetail vacLeaveDetail : entityList ) {
            list.add( toDto( vacLeaveDetail ) );
        }

        return list;
    }
}
